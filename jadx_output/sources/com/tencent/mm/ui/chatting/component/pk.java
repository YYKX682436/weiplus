package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class pk implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f199718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sb5.s0 f199719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.lk f199722e;

    public pk(com.tencent.mm.ui.chatting.component.lk lkVar, boolean z17, sb5.s0 s0Var, java.lang.String str, java.lang.String str2) {
        this.f199722e = lkVar;
        this.f199718a = z17;
        this.f199719b = s0Var;
        this.f199720c = str;
        this.f199721d = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        boolean z17 = this.f199718a;
        com.tencent.mm.ui.chatting.component.lk lkVar = this.f199722e;
        if (z17) {
            sb5.s0 s0Var = this.f199719b;
            if (((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e != null && ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.getCallback() != null && (((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.getCallback() instanceof com.tencent.mm.ui.chatting.i8)) {
                java.lang.String str = this.f199720c;
                if (str.contains("com.sohu.inputmethod.sogou")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 3);
                } else if (str.contains("com.tencent.qqpinyin")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 4);
                }
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.lang.String str2 = this.f199721d;
                if ((com.tencent.mm.sdk.platformtools.x.J(str2, options) == null || options.outHeight <= ip.c.c()) && options.outWidth <= ip.c.c()) {
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXEmojiObject(str2));
                    java.lang.String J2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(lkVar.f198580d.g(), wXMediaMessage, null);
                    if (J2 != null) {
                        ((com.tencent.mm.ui.chatting.i8) ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.getCallback()).d(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(J2));
                    }
                } else {
                    dp.a.makeText(lkVar.f198580d.g(), com.tencent.mm.R.string.bvm, 0).show();
                }
                lkVar.f199438e.B();
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 21);
        k70.i0 i0Var = new k70.i0();
        i0Var.f304642a = 5;
        java.lang.String str3 = this.f199721d;
        java.lang.String t17 = lkVar.f198580d.t();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (t17 == null) {
            t17 = "";
        }
        r70.g gVar = new r70.g(str3, 0, t17, lkVar.f198580d.x(), i0Var);
        gVar.f393108j = "component_copy_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        lkVar.f199438e.B();
    }
}
