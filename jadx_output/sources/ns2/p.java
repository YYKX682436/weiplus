package ns2;

/* loaded from: classes2.dex */
public final class p extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f339417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity, androidx.fragment.app.Fragment fragment, int i17, java.util.List list) {
        super(activity, fragment, list, null, null, 24, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339417d = i17;
    }

    @Override // ns2.l
    public void a() {
        java.util.Iterator it = this.f339416c.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setBackgroundColor(this.f339417d);
        }
    }
}
