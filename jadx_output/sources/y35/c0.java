package y35;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f459193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.d0 f459194e;

    public c0(y35.d0 d0Var, java.util.LinkedList linkedList) {
        this.f459194e = d0Var;
        this.f459193d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        y35.d0 d0Var = this.f459194e;
        ((java.util.LinkedList) d0Var.f459206e.Z).clear();
        ((java.util.LinkedList) d0Var.f459206e.Z).addAll(this.f459193d);
        com.tencent.mm.pluginsdk.ui.preference.SnsPreference snsPreference = d0Var.f459206e;
        snsPreference.N(snsPreference.Z);
    }
}
