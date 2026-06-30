package com.tencent.mm.ui.conversation;

/* loaded from: classes3.dex */
public class u5 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208098a;

    public u5(com.tencent.mm.ui.conversation.q5 q5Var, android.app.Activity activity) {
        this.f208098a = activity;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        java.util.HashMap hashMap = j35.u.f297521a;
        android.app.Activity activity = this.f208098a;
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPermissionUtil", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MPermissionUtil", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (i17 == 67 || i17 == 68) {
                if (iArr[0] != 0) {
                    db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhm), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.h(activity), null);
                }
            } else if (i17 != 144) {
                if (i17 != 160) {
                    int i18 = com.tencent.mm.R.string.hh8;
                    switch (i17) {
                        case 18:
                            if (iArr[0] != 0) {
                                if (!"android.permission.CAMERA".equals(strArr[0])) {
                                    i18 = com.tencent.mm.R.string.hhn;
                                }
                                if (iArr[0] != 0) {
                                    db5.e1.C(activity, activity.getString(i18), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.r(activity), new j35.s());
                                    break;
                                }
                            }
                            break;
                        case 19:
                        case 21:
                        case 22:
                            if (iArr[0] != 0) {
                                if (!"android.permission.CAMERA".equals(strArr[0])) {
                                    i18 = com.tencent.mm.R.string.hhn;
                                }
                                if (iArr[0] != 0) {
                                    db5.e1.C(activity, activity.getString(i18), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.t(activity), new j35.e());
                                    break;
                                }
                            }
                            break;
                        case 20:
                            if (iArr[0] != 0) {
                                db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hh8), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.f(activity), null);
                                break;
                            }
                            break;
                        default:
                            switch (i17) {
                                case 80:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhn), "", activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.p(activity), new j35.q());
                                        break;
                                    }
                                    break;
                                case 81:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhn), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.i(activity), null);
                                        break;
                                    }
                                    break;
                                case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                                case 83:
                                    if (iArr[0] != 0) {
                                        db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhn), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.j(activity), null);
                                        break;
                                    }
                                    break;
                            }
                    }
                } else if (iArr[0] != 0) {
                    db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.f492697mv1), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.k(activity), null);
                }
            } else if (iArr[0] != 0) {
                db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.f492695mv0), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.hh9), false, new j35.g(activity), null);
            }
        }
        j35.b.a(activity);
    }
}
