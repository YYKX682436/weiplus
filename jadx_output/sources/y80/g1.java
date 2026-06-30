package y80;

/* loaded from: classes8.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f459849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.model.LocationInfo f459851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context, y80.n1 n1Var, java.lang.String str, com.tencent.mm.plugin.location.model.LocationInfo locationInfo) {
        super(3);
        this.f459848d = context;
        this.f459849e = n1Var;
        this.f459850f = str;
        this.f459851g = locationInfo;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        android.content.Context context = this.f459848d;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        }
        if (booleanValue) {
            y80.n1 n1Var = this.f459849e;
            n1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quickShareLocation: ");
            java.lang.String str2 = this.f459850f;
            sb6.append(str2);
            sb6.append(", ");
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f459851g;
            sb6.append(locationInfo.f144591m);
            com.tencent.mars.xlog.Log.i(n1Var.f459887d, sb6.toString());
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Ai().g(str2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(locationInfo));
            intent.putExtra("Retr_Msg_Type", 9);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}
