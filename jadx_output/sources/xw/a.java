package xw;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f457498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f457499e;

    public a(xw.b bVar, com.tencent.mm.modelbase.p0 p0Var, java.util.Map map) {
        this.f457498d = p0Var;
        this.f457499e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.j4 j4Var;
        r45.fm6 a17;
        com.tencent.mm.modelbase.p0 p0Var = this.f457498d;
        if (p0Var == null || (j4Var = p0Var.f70726a) == null || j4Var.f377561h == null || com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) this.f457499e.get(".sysmsg.bizlivenotify.op_flag"), 1) != 1 || (a17 = bs1.a.a()) == null) {
            return;
        }
        java.util.LinkedList linkedList = a17.f374454d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        com.tencent.mm.pluginsdk.model.b0.f189197a.s(linkedList);
    }
}
