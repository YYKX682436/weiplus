package mo3;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.v8 f330413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f330414e;

    public j(mo3.l lVar, c01.v8 v8Var, java.util.List list) {
        this.f330413d = v8Var;
        this.f330414e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f330413d.c(this.f330414e);
    }
}
