package i31;

/* loaded from: classes9.dex */
public final class f implements m31.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i31.i f288101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f288102b;

    public f(i31.i iVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f288101a = iVar;
        this.f288102b = mMActivity;
    }

    @Override // m31.d
    public void a(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        i31.i iVar = this.f288101a;
        iVar.getClass();
        com.tencent.mm.ui.MMActivity activity = this.f288102b;
        kotlin.jvm.internal.o.g(activity, "activity");
        j31.a aVar = iVar.f288112f;
        aVar.getClass();
        java.lang.String str = item.f71803f;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f297360g = str;
        java.lang.String str2 = item.f71802e;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        aVar.f297361h = str2;
        aVar.f297359f = item.f71820z;
        iVar.i(2);
        activity.mmSetOnActivityResultCallback(new i31.g(iVar, i17));
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI.class);
        intent.putExtra("key_data", item);
        intent.putExtra("key_status_subscribed", item.f71807m == 1);
        j45.l.v(activity, "com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI", intent, iVar.f288108b);
    }

    @Override // m31.d
    public boolean b(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f288101a.getClass();
        return item.f71807m == 1;
    }
}
