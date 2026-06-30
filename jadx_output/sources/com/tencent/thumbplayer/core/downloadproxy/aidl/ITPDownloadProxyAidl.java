package com.tencent.thumbplayer.core.downloadproxy.aidl;

/* loaded from: classes16.dex */
public interface ITPDownloadProxyAidl extends android.os.IInterface {

    /* loaded from: classes16.dex */
    public static class Default implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int clearCache(java.lang.String str, java.lang.String str2, int i17) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getClipPlayUrl(int i17, int i18, int i19) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getNativeInfo(int i17) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getPlayErrorCodeStr(int i17) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public java.lang.String getPlayUrl(int i17, int i18) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public long getResourceSize(java.lang.String str, java.lang.String str2) {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int init(java.lang.String str) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int pauseDownload(int i17) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void pushEvent(int i17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int resumeDownload(int i17) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl) {
            return false;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setMaxStorageSizeMB(long j17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setPlayState(int i17, int i18) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void setUserData(java.util.Map map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPlay(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startClipPreload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void startTask(int i17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPlay(int i17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void stopPreload(int i17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
        public void updateTaskInfo(int i17, java.util.Map map) {
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl {
        private static final java.lang.String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl";
        static final int TRANSACTION_checkResourceStatus = 18;
        static final int TRANSACTION_clearCache = 17;
        static final int TRANSACTION_getClipPlayUrl = 6;
        static final int TRANSACTION_getNativeInfo = 16;
        static final int TRANSACTION_getPlayErrorCodeStr = 7;
        static final int TRANSACTION_getPlayUrl = 5;
        static final int TRANSACTION_getResourceSize = 19;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_pauseDownload = 9;
        static final int TRANSACTION_pushEvent = 20;
        static final int TRANSACTION_resumeDownload = 10;
        static final int TRANSACTION_setClipInfo = 4;
        static final int TRANSACTION_setMaxStorageSizeMB = 22;
        static final int TRANSACTION_setPlayState = 21;
        static final int TRANSACTION_setUserData = 15;
        static final int TRANSACTION_startClipPlay = 3;
        static final int TRANSACTION_startClipPreload = 12;
        static final int TRANSACTION_startPlay = 2;
        static final int TRANSACTION_startPreload = 11;
        static final int TRANSACTION_startTask = 14;
        static final int TRANSACTION_stopPlay = 8;
        static final int TRANSACTION_stopPreload = 13;
        static final int TRANSACTION_updateTaskInfo = 23;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl {
            public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().checkResourceStatus(str, str2, i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int clearCache(java.lang.String str, java.lang.String str2, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().clearCache(str, str2, i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public java.lang.String getClipPlayUrl(int i17, int i18, int i19) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeInt(i19);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().getClipPlayUrl(i17, i18, i19);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public java.lang.String getNativeInfo(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().getNativeInfo(i17);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public java.lang.String getPlayErrorCodeStr(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().getPlayErrorCodeStr(i17);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public java.lang.String getPlayUrl(int i17, int i18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().getPlayUrl(i17, i18);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public long getResourceSize(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().getResourceSize(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int init(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().init(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int pauseDownload(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().pauseDownload(i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void pushEvent(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(20, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().pushEvent(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int resumeDownload(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().resumeDownload(i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str);
                    if (tPDownloadParamAidl != null) {
                        obtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().setClipInfo(i17, i18, str, tPDownloadParamAidl);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setMaxStorageSizeMB(long j17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeLong(j17);
                    if (this.mRemote.transact(22, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().setMaxStorageSizeMB(j17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setPlayState(int i17, int i18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    if (this.mRemote.transact(21, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().setPlayState(i17, i18);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void setUserData(java.util.Map map) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(15, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().setUserData(map);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPlay(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    obtain.writeStrongBinder(iTPPlayListenerAidl != null ? iTPPlayListenerAidl.asBinder() : null);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().startClipPlay(str, i17, iTPPlayListenerAidl);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startClipPreload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    obtain.writeStrongBinder(iTPPreLoadListenerAidl != null ? iTPPreLoadListenerAidl.asBinder() : null);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().startClipPreload(str, i17, iTPPreLoadListenerAidl);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (tPDownloadParamAidl != null) {
                        obtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iTPPlayListenerAidl != null ? iTPPlayListenerAidl.asBinder() : null);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().startPlay(str, tPDownloadParamAidl, iTPPlayListenerAidl);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (tPDownloadParamAidl != null) {
                        obtain.writeInt(1);
                        tPDownloadParamAidl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iTPPreLoadListenerAidl != null ? iTPPreLoadListenerAidl.asBinder() : null);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().startPreload(str, tPDownloadParamAidl, iTPPreLoadListenerAidl);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void startTask(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().startTask(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPlay(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().stopPlay(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void stopPreload(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().stopPreload(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl
            public void updateTaskInfo(int i17, java.util.Map map) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(23, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.getDefaultImpl().updateTaskInfo(i17, map);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl)) ? new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.Proxy(iBinder) : (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl) queryLocalInterface;
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl getDefaultImpl() {
            return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl iTPDownloadProxyAidl) {
            if (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTPDownloadProxyAidl == null) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl.Stub.Proxy.sDefaultImpl = iTPDownloadProxyAidl;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i17) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int init = init(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(init);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startPlay = startPlay(parcel.readString(), parcel.readInt() != 0 ? com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.CREATOR.createFromParcel(parcel) : null, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(startPlay);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startClipPlay = startClipPlay(parcel.readString(), parcel.readInt(), com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(startClipPlay);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean clipInfo = setClipInfo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(clipInfo ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String playUrl = getPlayUrl(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(playUrl);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String clipPlayUrl = getClipPlayUrl(parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(clipPlayUrl);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String playErrorCodeStr = getPlayErrorCodeStr(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(playErrorCodeStr);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopPlay(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int pauseDownload = pauseDownload(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(pauseDownload);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    int resumeDownload = resumeDownload(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(resumeDownload);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startPreload = startPreload(parcel.readString(), parcel.readInt() != 0 ? com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.CREATOR.createFromParcel(parcel) : null, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(startPreload);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int startClipPreload = startClipPreload(parcel.readString(), parcel.readInt(), com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(startClipPreload);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopPreload(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    startTask(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    setUserData(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String nativeInfo = getNativeInfo(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(nativeInfo);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int clearCache = clearCache(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(clearCache);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int checkResourceStatus = checkResourceStatus(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(checkResourceStatus);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    long resourceSize = getResourceSize(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(resourceSize);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    pushEvent(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlayState(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    setMaxStorageSizeMB(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    updateTaskInfo(parcel.readInt(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17);

    int clearCache(java.lang.String str, java.lang.String str2, int i17);

    java.lang.String getClipPlayUrl(int i17, int i18, int i19);

    java.lang.String getNativeInfo(int i17);

    java.lang.String getPlayErrorCodeStr(int i17);

    java.lang.String getPlayUrl(int i17, int i18);

    long getResourceSize(java.lang.String str, java.lang.String str2);

    int init(java.lang.String str);

    int pauseDownload(int i17);

    void pushEvent(int i17);

    int resumeDownload(int i17);

    boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl);

    void setMaxStorageSizeMB(long j17);

    void setPlayState(int i17, int i18);

    void setUserData(java.util.Map map);

    int startClipPlay(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl);

    int startClipPreload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl);

    int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl);

    int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl tPDownloadParamAidl, com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl iTPPreLoadListenerAidl);

    void startTask(int i17);

    void stopPlay(int i17);

    void stopPreload(int i17);

    void updateTaskInfo(int i17, java.util.Map map);
}
