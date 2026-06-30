package n62;

/* loaded from: classes12.dex */
public class h implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n62.k f335193d;

    public h(n62.k kVar) {
        this.f335193d = kVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        n62.k kVar = this.f335193d;
        if (!kVar.f335204n.contains(str)) {
            kVar.f335204n.add(str);
        }
        kVar.f335205o.removeMessages(0);
        kVar.f335205o.sendEmptyMessageDelayed(0, 60L);
    }
}
