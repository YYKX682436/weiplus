package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes13.dex */
public class TPDLProxyUtils {
    private static final java.lang.String FILE_NAME = "TPDLProxyUtils";

    public static java.lang.String byteArrayToString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "byteArrayToString failed, error:" + th6.toString());
            return "";
        }
    }

    public static java.lang.String losePackageCheck(int i17) {
        java.lang.String str;
        java.lang.String str2 = "";
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("ping -c " + i17 + " www.qq.com").getInputStream()));
            str = "";
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.contains(" packet loss")) {
                        str2 = readLine.substring(10 + readLine.indexOf("received, "), readLine.indexOf("%") + 1);
                    }
                    if (readLine.contains("avg")) {
                        int indexOf = readLine.indexOf("/", 20);
                        str = readLine.substring(indexOf + 1, readLine.indexOf(".", indexOf));
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Throwable unused2) {
            str = "";
        }
        return str2 + ";" + str;
    }

    public static int objectToInt(java.lang.Object obj, int i17) {
        if (obj == null) {
            return i17;
        }
        try {
            return ((java.lang.Integer) obj).intValue();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "object to int failed, error:" + th6.toString());
            return i17;
        }
    }

    public static long objectToLong(java.lang.Object obj, long j17) {
        if (obj == null) {
            return j17;
        }
        try {
            return ((java.lang.Long) obj).longValue();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "object to long failed, error:" + th6.toString());
            return j17;
        }
    }

    public static java.lang.String serialize(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.io.ObjectOutputStream objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    java.lang.String byteArrayOutputStream2 = byteArrayOutputStream.toString(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                    try {
                        objectOutputStream2.close();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string  objectOutputStream close, error:" + th6.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th7) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string byteArrayOutputStream close, error:" + th7.toString());
                    }
                    return byteArrayOutputStream2;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    objectOutputStream = objectOutputStream2;
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize obj, error:" + th.toString());
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (java.lang.Throwable th9) {
                                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string  objectOutputStream close, error:" + th9.toString());
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            return "";
                        } catch (java.lang.Throwable th10) {
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string byteArrayOutputStream close, error:" + th10.toString());
                            return "";
                        }
                    } finally {
                    }
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
            }
        } catch (java.lang.Throwable th12) {
            th = th12;
            byteArrayOutputStream = null;
        }
    }

    public static java.lang.Object serializeToObject(java.lang.String str) {
        java.io.ObjectInputStream objectInputStream;
        java.io.ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new java.io.ByteArrayInputStream(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            try {
                objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                try {
                    java.lang.Object readObject = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize to obj objectInputStream close, error:" + th6.toString());
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th7) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize to obj byteArrayInputStream close, error:" + th7.toString());
                    }
                    return readObject;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize to obj , error:" + th.toString());
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.lang.Throwable th9) {
                                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize to obj objectInputStream close, error:" + th9.toString());
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (java.lang.Throwable th10) {
                                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "serialize to obj byteArrayInputStream close, error:" + th10.toString());
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                objectInputStream = null;
            }
        } catch (java.lang.Throwable th12) {
            th = th12;
            objectInputStream = null;
            byteArrayInputStream = null;
        }
    }
}
