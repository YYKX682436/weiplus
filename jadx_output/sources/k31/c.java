package k31;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f303823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f303824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f303825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, boolean z18, boolean z19) {
        super(2);
        this.f303823d = z17;
        this.f303824e = z18;
        this.f303825f = z19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem toUpdateItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj2;
        kotlin.jvm.internal.o.g(toUpdateItem, "toUpdateItem");
        if (subscribeMsgTmpItem != null) {
            if (this.f303823d) {
                subscribeMsgTmpItem.f71807m = toUpdateItem.f71807m;
                subscribeMsgTmpItem.f71815u = toUpdateItem.f71815u;
                subscribeMsgTmpItem.f71814t = toUpdateItem.f71814t;
                subscribeMsgTmpItem.f71818x = toUpdateItem.f71818x;
                subscribeMsgTmpItem.f71817w = toUpdateItem.f71817w;
                subscribeMsgTmpItem.B = toUpdateItem.B;
                subscribeMsgTmpItem.C = toUpdateItem.C;
                subscribeMsgTmpItem.f71819y = toUpdateItem.f71819y;
                subscribeMsgTmpItem.A = toUpdateItem.A;
            }
            if (this.f303824e) {
                subscribeMsgTmpItem.f71809o = toUpdateItem.f71809o;
            }
            if (this.f303825f) {
                subscribeMsgTmpItem.f71808n = toUpdateItem.f71808n;
            }
        }
        return jz5.f0.f302826a;
    }
}
