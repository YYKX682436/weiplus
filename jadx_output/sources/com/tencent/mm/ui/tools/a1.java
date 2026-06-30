package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.tools.a1 f210267a = new com.tencent.mm.ui.tools.a1();

    public static final void a(com.tencent.mm.ui.tools.a1 a1Var, android.app.Activity activity, android.widget.TextView textView, java.lang.String str, java.lang.String str2) {
        a1Var.getClass();
        if (activity.isFinishing() || activity.isDestroyed() || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        textView.setText(str + '\n' + str2);
    }

    public static final void b(com.tencent.mm.ui.tools.a1 a1Var, android.app.Activity activity, android.widget.TextView textView, java.lang.String str) {
        a1Var.getClass();
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        int textSize = (int) ((textView.getTextSize() * 140) / 100.0f);
        if (textSize > 0) {
            androidx.core.widget.a0.f(textView, textSize);
        }
        textView.setVisibility(0);
    }

    public static final boolean c() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigShowImgAlbumDateTip()) == 1;
    }

    public static final void d(android.app.Activity activity, com.tencent.mm.storage.f9 msgInfo, boolean z17, boolean z18, int i17, int i18, com.tencent.mm.ui.tools.s0 onConfirmSave) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(onConfirmSave, "onConfirmSave");
        e(activity, msgInfo, z17, z18, i17, i18, onConfirmSave, null);
    }

    public static final void e(android.app.Activity activity, com.tencent.mm.storage.f9 msgInfo, boolean z17, boolean z18, int i17, int i18, com.tencent.mm.ui.tools.s0 onConfirmSave, java.lang.Runnable runnable) {
        android.widget.TextView textView;
        int i19;
        android.net.Uri uri;
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(onConfirmSave, "onConfirmSave");
        int i27 = 1;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, true);
        java.lang.String str2 = null;
        if (z18) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.obp);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.eh7, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (android.widget.TextView) inflate;
            textView.setText(string);
            int textSize = (int) ((textView.getTextSize() * 140) / 100.0f);
            if (textSize > 0) {
                androidx.core.widget.a0.f(textView, textSize);
            }
            if (c()) {
                if (z17) {
                    h90.a[] aVarArr = h90.a.f279671d;
                    i19 = 2;
                } else {
                    h90.a[] aVarArr2 = h90.a.f279671d;
                    i19 = 5;
                }
                jz5.l Ni = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ni(msgInfo, i19, new com.tencent.mm.pointers.PInt());
                java.lang.Long l17 = (java.lang.Long) Ni.f302834e;
                if (l17 != null) {
                    if (!(l17.longValue() > 0)) {
                        l17 = null;
                    }
                    if (l17 != null) {
                        uri = com.tencent.mm.sdk.platformtools.v6.b(activity, l17.longValue(), android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                        str = (java.lang.String) Ni.f302833d;
                        if (str != null && (true ^ com.tencent.mm.sdk.platformtools.t8.K0(str))) {
                            str2 = str;
                        }
                        com.tencent.mm.ui.tools.r0.c(activity, uri, str2, new com.tencent.mm.ui.tools.u0(activity, textView, string));
                    }
                }
                uri = null;
                str = (java.lang.String) Ni.f302833d;
                if (str != null) {
                    str2 = str;
                }
                com.tencent.mm.ui.tools.r0.c(activity, uri, str2, new com.tencent.mm.ui.tools.u0(activity, textView, string));
            }
        } else {
            java.lang.String string2 = activity.getString(com.tencent.mm.R.string.ncz);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.view.View inflate2 = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.eh7, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (android.widget.TextView) inflate2;
            textView.setText(string2);
            int textSize2 = (int) ((textView.getTextSize() * 140) / 100.0f);
            if (textSize2 > 0) {
                androidx.core.widget.a0.f(textView, textSize2);
            }
            if (c()) {
                if (z17) {
                    h90.a[] aVarArr3 = h90.a.f279671d;
                } else {
                    h90.a[] aVarArr4 = h90.a.f279671d;
                    i27 = 4;
                }
                jz5.l Ni2 = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ni(msgInfo, i27, new com.tencent.mm.pointers.PInt());
                com.tencent.mm.ui.tools.t0 t0Var = new com.tencent.mm.ui.tools.t0(activity, textView, string2);
                java.lang.Object obj = Ni2.f302834e;
                if (((java.lang.Long) obj) != null) {
                    kotlin.jvm.internal.o.d(obj);
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number.longValue() > 0) {
                        com.tencent.mm.ui.tools.r0.b(activity, number.longValue(), t0Var);
                    }
                }
                java.lang.String str3 = (java.lang.String) Ni2.f302833d;
                if (str3 == null || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    t0Var.a(null);
                } else {
                    com.tencent.mm.ui.tools.r0.d(activity, str3, t0Var);
                }
            }
        }
        k0Var.s(textView, false);
        k0Var.f211872n = new com.tencent.mm.ui.tools.v0(activity);
        k0Var.C = new com.tencent.mm.ui.tools.w0(activity, msgInfo, i17, i18);
        k0Var.f211881s = new com.tencent.mm.ui.tools.x0(activity, runnable, onConfirmSave, msgInfo, i17, i18);
        k0Var.v();
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (msgInfo.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.l(sVar, msgInfo, i17, i18), "c2c_origin_auto_clean");
    }
}
