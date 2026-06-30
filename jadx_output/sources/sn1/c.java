package sn1;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f409993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f409994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sn1.i f409996g;

    public c(sn1.i iVar, int i17, int i18, java.lang.String str) {
        this.f409996g = iVar;
        this.f409993d = i17;
        this.f409994e = i18;
        this.f409995f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        java.util.Map map = sn1.i.f410012f;
        synchronized (map) {
            set = (java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(this.f409996g.getType()));
        }
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(set);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.u0 u0Var = (com.tencent.mm.modelbase.u0) it.next();
            if (u0Var != null && set.contains(u0Var)) {
                u0Var.onSceneEnd(this.f409993d, this.f409994e, this.f409995f, this.f409996g);
            }
        }
    }
}
