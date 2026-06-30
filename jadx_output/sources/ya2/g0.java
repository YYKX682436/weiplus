package ya2;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f460480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cl0.g gVar) {
        super(0);
        this.f460480d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cl0.g gVar = this.f460480d;
        java.lang.String optString = gVar.optString(dm.i4.COL_USERNAME);
        java.lang.String optString2 = gVar.optString("nickname");
        java.lang.String optString3 = gVar.optString("headUrl");
        java.lang.String optString4 = gVar.optString("signature");
        int optInt = gVar.optInt("profileRefScene");
        gVar.optString("extRelationInfo");
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = new ya2.b2();
        kotlin.jvm.internal.o.d(optString);
        b2Var.field_username = optString;
        kotlin.jvm.internal.o.d(optString2);
        b2Var.field_nickname = optString2;
        kotlin.jvm.internal.o.d(optString3);
        b2Var.field_avatarUrl = optString3;
        kotlin.jvm.internal.o.d(optString4);
        b2Var.field_signature = optString4;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        koVar.b(b2Var, intent);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String c17 = com.tencent.mm.plugin.finder.service.m4.f126148a.c(optString, 3);
        intent.putExtra("IsPoster", true);
        intent.putExtra("Action", 1);
        intent.putExtra("hideSendMsg", true);
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
            k17 = com.tencent.mm.app.w.INSTANCE.j();
        }
        android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
        if (activity != null) {
            intent.putExtra("SessionId", c17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(activity, intent, optInt);
        }
        return jz5.f0.f302826a;
    }
}
