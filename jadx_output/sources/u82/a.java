package u82;

/* loaded from: classes8.dex */
public class a extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f425491x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.qs0 f425492y;

    public a(ak3.c cVar) {
        super(cVar);
        this.f425491x = "";
        this.f425492y = new r45.qs0();
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f425491x) || com.tencent.mm.vfs.w6.j(this.f425491x)) {
            return !(this instanceof com.tencent.mm.pluginsdk.ui.tools.p3);
        }
        return false;
    }

    @Override // jk3.b
    public boolean x() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f425491x) || com.tencent.mm.vfs.w6.j(this.f425491x);
    }
}
