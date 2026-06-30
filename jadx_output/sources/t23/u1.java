package t23;

/* loaded from: classes10.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t23.x1 f415277d;

    public u1(t23.x1 x1Var) {
        this.f415277d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaQueryService", "real run, %s.", this);
        t23.x1 x1Var = this.f415277d;
        java.util.LinkedList b17 = x1Var.f415296e.b();
        java.util.HashSet hashSet = x1Var.f415292a;
        int size = hashSet.size();
        t23.k1[] k1VarArr = new t23.k1[size];
        hashSet.toArray(k1VarArr);
        for (int i17 = 0; i17 < size; i17++) {
            k1VarArr[i17].F6(b17);
        }
        android.net.Uri uri = t23.o2.f415216e;
        java.util.LinkedList f17 = t23.n2.f415209a.f();
        java.util.HashSet hashSet2 = x1Var.f415293b;
        int size2 = hashSet2.size();
        t23.k1[] k1VarArr2 = new t23.k1[size2];
        hashSet2.toArray(k1VarArr2);
        for (int i18 = 0; i18 < size2; i18++) {
            k1VarArr2[i18].F6(f17);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|queryAlbums";
    }
}
