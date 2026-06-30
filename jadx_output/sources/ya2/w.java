package ya2;

/* loaded from: classes3.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f460571d;

    public w(java.lang.String str, java.lang.String str2, android.content.Context context, kotlin.jvm.internal.h0 h0Var) {
        this.f460568a = str;
        this.f460569b = str2;
        this.f460570c = context;
        this.f460571d = h0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.v71 v71Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (v71Var = (r45.v71) fVar.f70618d) != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) v71Var.getCustom(3)) != null) {
            ya2.h.f460484a.j(finderContact);
            r45.h32 h32Var = new r45.h32();
            h32Var.set(4, this.f460568a);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", this.f460569b);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.toByteArray());
            kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", !kotlin.jvm.internal.o.b(xy2.c.e(r11), r2));
            android.content.Context context = this.f460570c;
            if (!(context instanceof android.app.Activity)) {
                context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            }
            jz2.x0 x0Var = jz2.x0.f302754a;
            intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.G).getValue());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            android.content.Context context2 = context;
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderLiveNoticeQrCodeUI$realGoToNoticePage", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderLiveNoticeQrCodeUI$realGoToNoticePage", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        kotlin.jvm.internal.h0 h0Var = this.f460571d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
