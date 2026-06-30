package qi3;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f363702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f363702d = i17;
        this.f363703e = str;
        this.f363704f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.fr pack = (r45.fr) obj;
        kotlin.jvm.internal.o.g(pack, "pack");
        r45.hr hrVar = new r45.hr();
        hrVar.f376395e = this.f363702d;
        java.lang.String str = this.f363703e;
        java.lang.String str2 = this.f363704f;
        if (str != null || str2 != null) {
            r45.sr srVar = new r45.sr();
            if (str == null) {
                str = "";
            }
            srVar.f385931d = str;
            if (str2 == null) {
                str2 = "";
            }
            srVar.f385932e = str2;
            hrVar.f376396f = srVar;
        }
        pack.f374569u = hrVar;
        return jz5.f0.f302826a;
    }
}
