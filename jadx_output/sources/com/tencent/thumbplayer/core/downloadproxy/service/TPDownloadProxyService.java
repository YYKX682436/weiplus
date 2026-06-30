package com.tencent.thumbplayer.core.downloadproxy.service;

/* loaded from: classes13.dex */
public class TPDownloadProxyService extends android.app.Service {
    private static final java.lang.String FILE_NAME = "TPDownloadProxyService";
    private int pid = -1;
    private com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub downloadProxyFactory = null;

    /* loaded from: classes16.dex */
    public class DownloadProxy extends com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub {
        private com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy downloadProxy;

        public DownloadProxy(int i17) {
            this.downloadProxy = null;
            this.downloadProxy = com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.getTPDownloadProxy(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17) {
            try {
                return this.downloadProxy.checkResourceStatus(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int clearCache(java.lang.String str, java.lang.String str2, int i17) {
            try {
                return this.downloadProxy.clearCache(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getClipPlayUrl(int i17, int i18, int i19) {
            return this.downloadProxy.getClipPlayUrl(i17, i18, i19);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getNativeInfo(int i17) {
            try {
                return this.downloadProxy.getNativeInfo(i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th6.toString());
                return null;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getPlayErrorCodeStr(int i17) {
            return this.downloadProxy.getPlayErrorCodeStr(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getPlayUrl(int i17, int i18) {
            return this.downloadProxy.getPlayUrl(i17, i18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public long getResourceSize(java.lang.String str, java.lang.String str2) {
            try {
                return this.downloadProxy.getResourceSize(str, str2);
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th6.toString());
                return -1L;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int init(java.lang.String str) {
            try {
                com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam tPDLProxyInitParam = (com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam) com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils.serializeToObject(str);
                if (tPDLProxyInitParam != null) {
                    return this.downloadProxy.init(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper.getContext(), tPDLProxyInitParam);
                }
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "param is null");
                return -1;
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th6.toString());
                return -2;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int pauseDownload(int i17) {
            return this.downloadProxy.pauseDownload(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void pushEvent(int i17) {
            this.downloadProxy.pushEvent(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int resumeDownload(int i17) {
            return this.downloadProxy.resumeDownload(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl) {
            return this.downloadProxy.setClipInfo(i17, i18, str, new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()));
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setMaxStorageSizeMB(long j17) {
            this.downloadProxy.setMaxStorageSizeMB(j17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setPlayState(int i17, int i18) {
            this.downloadProxy.setPlayState(i17, i18);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setUserData(java.util.Map map) {
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.setUserData((java.lang.String) entry.getKey(), entry.getValue());
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th6.toString());
                        }
                    }
                }
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPlay(java.lang.String str, int i17, final com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
            return this.downloadProxy.startClipPlay(str, i17, new com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.2
                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public long getAdvRemainTime() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getAdvRemainTime();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.String getContentType(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getContentType(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public int getCurrentPlayClipNo() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPlayClipNo();
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipNo failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public long getCurrentPlayOffset() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPlayOffset();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public long getCurrentPosition() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getCurrentPosition();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.String getDataFilePath(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getDataFilePath(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public long getDataTotalSize(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getDataTotalSize(i18, str2, str3);
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.String getM3U8Content(int i18, java.lang.String str2, java.lang.String str3) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getM3U8Content(i18, str2, str3) : "";
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getM3U8Content key failed, error:" + th6.toString());
                        return "";
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.Object getPlayInfo(long j17) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayInfo(java.lang.Long.toString(j17));
                        }
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th6.toString());
                        return null;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public long getPlayerBufferLength() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayerBufferLength();
                        }
                        return -1L;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th6.toString());
                        return -1L;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlExpired(map);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlInfoUpdate(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadCdnUrlUpdate(java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadCdnUrlUpdate(str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadError(int i18, int i19, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadError(i18, i19, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadFinish() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadFinish();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadFinish failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadProgressUpdate(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadProgressUpdate(i18, i19, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadProtocolUpdate(java.lang.String str2, java.lang.String str3) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadProtocolUpdate(str2, str3);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public void onDownloadStatusUpdate(int i18) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            iTPPlayListenerAidl2.onDownloadStatusUpdate(i18);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.Object onPlayCallback(int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        if (obj != null) {
                            arrayList.add(obj2);
                        }
                        if (obj != null) {
                            arrayList.add(obj3);
                        }
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 == null) {
                            return null;
                        }
                        iTPPlayListenerAidl2.onPlayCallback(i18, arrayList);
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th6.toString());
                        return null;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public int onReadData(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onReadData(i18, str2, str3, j17, j18);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public int onStartReadData(int i18, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onStartReadData(i18, str2, str3, j17, j18);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public int onStopReadData(int i18, java.lang.String str2, java.lang.String str3, int i19) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.onStopReadData(i18, str2, str3, i19);
                        }
                        return -1;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th6.toString());
                        return -1;
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                public java.lang.Object getPlayInfo(java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl2 != null) {
                            return iTPPlayListenerAidl2.getPlayInfo(str2);
                        }
                        return null;
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th6.toString());
                        return null;
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPreload(java.lang.String str, int i17, final com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startClipPreload(str, i17, new com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.4
                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareDownloadProgressUpdate(int i18, int i19, long j17, long j18, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareDownloadProgressUpdate(i18, i19, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareError(int i18, int i19, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareError(i18, i19, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareOK() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareOK();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th6.toString());
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, final com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
            try {
                return this.downloadProxy.startPlay(str, new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.1
                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public long getAdvRemainTime() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getAdvRemainTime();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.String getContentType(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getContentType(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public int getCurrentPlayClipNo() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPlayClipNo();
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipInfo failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public long getCurrentPlayOffset() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPlayOffset();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public long getCurrentPosition() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getCurrentPosition();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.String getDataFilePath(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getDataFilePath(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public long getDataTotalSize(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getDataTotalSize(i17, str2, str3);
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.String getM3U8Content(int i17, java.lang.String str2, java.lang.String str3) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl2 != null ? iTPPlayListenerAidl2.getM3U8Content(i17, str2, str3) : "";
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getM3U8Content key failed, error:" + th6.toString());
                            return "";
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.Object getPlayInfo(long j17) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(java.lang.Long.toString(j17));
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th6.toString());
                            return null;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public long getPlayerBufferLength() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.getPlayerBufferLength();
                            }
                            return -1L;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th6.toString());
                            return -1L;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlExpired(map);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlInfoUpdate(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlInfoUpdate(str2, str3, str4, str5);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadCdnUrlUpdate(java.lang.String str2) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadCdnUrlUpdate(str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadError(int i17, int i18, java.lang.String str2) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadError(i17, i18, str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadFinish() {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadFinish();
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownlaodFinish failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str2) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadProgressUpdate(i17, i18, j17, j18, str2);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownlaodProgressUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadProtocolUpdate(java.lang.String str2, java.lang.String str3) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadProtocolUpdate(str2, str3);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public void onDownloadStatusUpdate(int i17) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                iTPPlayListenerAidl2.onDownloadStatusUpdate(i17);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th6.toString());
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        try {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                            if (obj3 != null) {
                                arrayList.add(obj3);
                            }
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 == null) {
                                return null;
                            }
                            iTPPlayListenerAidl2.onPlayCallback(i17, arrayList);
                            return null;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th6.toString());
                            return null;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public int onReadData(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onReadData(i17, str2, str3, j17, j18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public int onStartReadData(int i17, java.lang.String str2, java.lang.String str3, long j17, long j18) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onStartReadData(i17, str2, str3, j17, j18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public int onStopReadData(int i17, java.lang.String str2, java.lang.String str3, int i18) {
                        try {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl2 = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl2 != null) {
                                return iTPPlayListenerAidl2.onStopReadData(i17, str2, str3, i18);
                            }
                            return -1;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th6.toString());
                            return -1;
                        }
                    }

                    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
                    public java.lang.Object getPlayInfo(java.lang.String str2) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(str2);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th6.toString());
                            return null;
                        }
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th6.toString());
                return -1;
            }
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, final com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startPreload(str, new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener() { // from class: com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy.3
                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareDownloadProgressUpdate(i17, i18, j17, j18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareError(int i17, int i18, java.lang.String str2) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareError(i17, i18, str2);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th6.toString());
                    }
                }

                @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener
                public void onPrepareOK() {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl2 = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl2 != null) {
                            iTPPreLoadListenerAidl2.onPrepareOK();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th6.toString());
                    }
                }
            });
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void startTask(int i17) {
            this.downloadProxy.startTask(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPlay(int i17) {
            this.downloadProxy.stopPlay(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPreload(int i17) {
            this.downloadProxy.stopPreload(i17);
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void updateTaskInfo(int i17, java.util.Map map) {
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.updateTaskInfo(i17, (java.lang.String) entry.getKey(), entry.getValue());
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th6.toString());
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes16.dex */
    public class DownloadProxyFactory extends com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl.Stub {
        private java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl> mvTPDownloadProxyMap;

        private DownloadProxyFactory() {
            this.mvTPDownloadProxyMap = new java.util.HashMap<>();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public java.lang.String getNativeVersion() {
            return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.getNativeVersion();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public synchronized com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl getTPDownloadProxy(int i17) {
            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl iTPDownloadProxyAidl;
            iTPDownloadProxyAidl = this.mvTPDownloadProxyMap.get(java.lang.Integer.valueOf(i17));
            if (iTPDownloadProxyAidl == null) {
                iTPDownloadProxyAidl = new com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxy(i17);
                this.mvTPDownloadProxyMap.put(java.lang.Integer.valueOf(i17), iTPDownloadProxyAidl);
            }
            return iTPDownloadProxyAidl;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForDownload() {
            return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.isReadyForDownload();
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl
        public boolean isReadyForPlay() {
            return com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.isReadyForPlay();
        }
    }

    private boolean isExistMainProcess() {
        int i17;
        try {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                java.lang.String str = runningAppProcessInfo.processName;
                if (!android.text.TextUtils.isEmpty(str) && str.equals(getPackageName())) {
                    int i18 = this.pid;
                    if (i18 != -1 && i18 != (i17 = runningAppProcessInfo.pid)) {
                        this.pid = i17;
                        return false;
                    }
                    this.pid = runningAppProcessInfo.pid;
                    com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "app main exist!");
                    return true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "isExistMainProcess failed, error:" + th6.toString());
        }
        return false;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (this.downloadProxyFactory == null) {
            this.downloadProxyFactory = new com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService.DownloadProxyFactory();
        }
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on bind!");
        isExistMainProcess();
        return this.downloadProxyFactory;
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on rebind!");
        isExistMainProcess();
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        super.onStartCommand(intent, i17, i18);
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on start command!");
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.i(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "on unbind!");
        super.onUnbind(intent);
        if (isExistMainProcess()) {
            return true;
        }
        try {
            com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative.getInstance().stopAllDownload(3);
            com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().removeAllPlayListener();
            com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager.getInstance().removeAllPreLoadListener();
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, th6.toString());
            return true;
        }
    }
}
