package up3;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f429820e;

    public c(up3.o oVar, java.lang.String str, java.util.Map map) {
        this.f429819d = str;
        this.f429820e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((up3.p) ((java.util.TreeMap) up3.o.f429848q).get(this.f429819d)).a(this.f429820e);
    }
}
