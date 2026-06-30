package com.tencent.thumbplayer.core.downloadproxy.aidl;

/* loaded from: classes16.dex */
public interface ITPPlayListenerAidl extends android.os.IInterface {

    /* loaded from: classes16.dex */
    public static class Default implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getAdvRemainTime() {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int getCurrentPlayClipNo() {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPlayOffset() {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getCurrentPosition() {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public java.lang.String getPlayInfo(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public long getPlayerBufferLength() {
            return 0L;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlExpired(java.util.Map map) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadCdnUrlUpdate(java.lang.String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadError(int i17, int i18, java.lang.String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadFinish() {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public void onDownloadStatusUpdate(int i17) {
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onPlayCallback(int i17, java.util.List list) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return 0;
        }

        @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
        public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
            return 0;
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl {
        private static final java.lang.String DESCRIPTOR = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl";
        static final int TRANSACTION_getAdvRemainTime = 14;
        static final int TRANSACTION_getContentType = 21;
        static final int TRANSACTION_getCurrentPlayClipNo = 13;
        static final int TRANSACTION_getCurrentPlayOffset = 12;
        static final int TRANSACTION_getCurrentPosition = 11;
        static final int TRANSACTION_getDataFilePath = 20;
        static final int TRANSACTION_getDataTotalSize = 19;
        static final int TRANSACTION_getM3U8Content = 22;
        static final int TRANSACTION_getPlayInfo = 15;
        static final int TRANSACTION_getPlayerBufferLength = 10;
        static final int TRANSACTION_onDownloadCdnUrlExpired = 7;
        static final int TRANSACTION_onDownloadCdnUrlInfoUpdate = 6;
        static final int TRANSACTION_onDownloadCdnUrlUpdate = 5;
        static final int TRANSACTION_onDownloadError = 3;
        static final int TRANSACTION_onDownloadFinish = 2;
        static final int TRANSACTION_onDownloadProgressUpdate = 1;
        static final int TRANSACTION_onDownloadProtocolUpdate = 9;
        static final int TRANSACTION_onDownloadStatusUpdate = 8;
        static final int TRANSACTION_onPlayCallback = 4;
        static final int TRANSACTION_onReadData = 17;
        static final int TRANSACTION_onStartReadData = 16;
        static final int TRANSACTION_onStopReadData = 18;

        /* loaded from: classes16.dex */
        public static class Proxy implements com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl {
            public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl sDefaultImpl;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getAdvRemainTime() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getAdvRemainTime();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getContentType(i17, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int getCurrentPlayClipNo() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getCurrentPlayClipNo();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getCurrentPlayOffset() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getCurrentPlayOffset();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getCurrentPosition() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getCurrentPosition();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getDataFilePath(i17, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getDataTotalSize(i17, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR;
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getM3U8Content(i17, str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public java.lang.String getPlayInfo(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getPlayInfo(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getPlayerBufferLength() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().getPlayerBufferLength();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlExpired(java.util.Map map) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeMap(map);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadCdnUrlExpired(map);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlUpdate(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadCdnUrlUpdate(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadError(int i17, int i18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadError(i17, i18, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadFinish() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadFinish();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    obtain.writeString(str);
                    try {
                        if (this.mRemote.transact(1, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                        } else {
                            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadProgressUpdate(i17, i18, j17, j18, str);
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadProtocolUpdate(str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadStatusUpdate(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onDownloadStatusUpdate(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onPlayCallback(int i17, java.util.List list) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeList(list);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onPlayCallback(i17, list);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    try {
                        if (!this.mRemote.transact(17, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                            int onReadData = com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onReadData(i17, str, str2, j17, j18);
                            obtain2.recycle();
                            obtain.recycle();
                            return onReadData;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    try {
                        if (!this.mRemote.transact(16, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                            int onStartReadData = com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onStartReadData(i17, str, str2, j17, j18);
                            obtain2.recycle();
                            obtain.recycle();
                            return onStartReadData;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }

            @Override // com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.DESCRIPTOR);
                    obtain.writeInt(i17);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i18);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl() != null) {
                        return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.getDefaultImpl().onStopReadData(i17, str, str2, i18);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl)) ? new com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.Proxy(iBinder) : (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl) queryLocalInterface;
        }

        public static com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl getDefaultImpl() {
            return com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl iTPPlayListenerAidl) {
            if (com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.Proxy.sDefaultImpl != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTPPlayListenerAidl == null) {
                return false;
            }
            com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl.Stub.Proxy.sDefaultImpl = iTPPlayListenerAidl;
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
                    onDownloadProgressUpdate(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadFinish();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadError(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int onPlayCallback = onPlayCallback(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(onPlayCallback);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlUpdate(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlInfoUpdate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlExpired(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadStatusUpdate(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadProtocolUpdate(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    long playerBufferLength = getPlayerBufferLength();
                    parcel2.writeNoException();
                    parcel2.writeLong(playerBufferLength);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    long currentPosition = getCurrentPosition();
                    parcel2.writeNoException();
                    parcel2.writeLong(currentPosition);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    long currentPlayOffset = getCurrentPlayOffset();
                    parcel2.writeNoException();
                    parcel2.writeLong(currentPlayOffset);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPlayClipNo = getCurrentPlayClipNo();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPlayClipNo);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    long advRemainTime = getAdvRemainTime();
                    parcel2.writeNoException();
                    parcel2.writeLong(advRemainTime);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String playInfo = getPlayInfo(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(playInfo);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int onStartReadData = onStartReadData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(onStartReadData);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int onReadData = onReadData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(onReadData);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int onStopReadData = onStopReadData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(onStopReadData);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    long dataTotalSize = getDataTotalSize(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(dataTotalSize);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String dataFilePath = getDataFilePath(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(dataFilePath);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String contentType = getContentType(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(contentType);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    java.lang.String m3U8Content = getM3U8Content(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(m3U8Content);
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    long getAdvRemainTime();

    java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2);

    int getCurrentPlayClipNo();

    long getCurrentPlayOffset();

    long getCurrentPosition();

    java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2);

    long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2);

    java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2);

    java.lang.String getPlayInfo(java.lang.String str);

    long getPlayerBufferLength();

    void onDownloadCdnUrlExpired(java.util.Map map);

    void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void onDownloadCdnUrlUpdate(java.lang.String str);

    void onDownloadError(int i17, int i18, java.lang.String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str);

    void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2);

    void onDownloadStatusUpdate(int i17);

    int onPlayCallback(int i17, java.util.List list);

    int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18);
}
