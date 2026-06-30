package yk5;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f462889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462890e;

    public m(yk5.u uVar, java.util.List list) {
        this.f462890e = uVar;
        this.f462889d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        yk5.u uVar = this.f462890e;
        if (uVar.f462912v == null) {
            uVar.f462912v = new java.util.ArrayList();
        }
        uVar.f462912v.clear();
        uVar.f462912v.addAll(this.f462889d);
        uVar.f462912v.add("officialaccounts");
        uVar.f462912v.add("helper_entry");
    }
}
