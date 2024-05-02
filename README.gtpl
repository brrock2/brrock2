
### GitHub Stats[![markscribe](https://github.com/brrock2/brrock2/actions/workflows/markscribe.yml/badge.svg)](https://github.com/brrock2/brrock2/actions/workflows/markscribe.yml) [![Metrics](https://github.com/brrock2/brrock2/actions/workflows/update-readme.yml/badge.svg)](https://github.com/brrock2/brrock2/actions/workflows/update-readme.yml)
<p align="left"><img src="https://github.com/brrock/brrock/raw/main/github-metrics.svg" /></p>

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}
### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
