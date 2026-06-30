package ns2;

/* loaded from: classes2.dex */
public final class n extends ns2.o {

    /* renamed from: d, reason: collision with root package name */
    public int f339413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity, androidx.fragment.app.Fragment fragment, int i17, java.util.List list) {
        super(activity, fragment, list, null, null, 24, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339413d = i17;
    }

    @Override // ns2.l
    public void a() {
        for (android.view.View view : this.f339416c) {
            if (view instanceof android.widget.TextView) {
                ((android.widget.TextView) view).setTextColor(this.f339413d);
            } else if (view instanceof com.tencent.neattextview.textview.view.NeatTextView) {
                ((com.tencent.neattextview.textview.view.NeatTextView) view).setTextColor(this.f339413d);
            }
        }
    }
}
