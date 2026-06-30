package uf5;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f427254a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f427255b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f427256c;

    public k(android.app.Activity activity, yz5.p onSync, yz5.p onConfirm) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(onSync, "onSync");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        this.f427254a = activity;
        this.f427255b = onSync;
        this.f427256c = onConfirm;
    }

    public static final void a(uf5.k kVar, android.widget.ImageView imageView, java.util.Set set, java.util.List list) {
        kVar.getClass();
        l02.n.a(imageView, (list.isEmpty() ^ true) && set.size() == list.size() ? "checkbox_cell_on" : "checkbox_cell_off");
    }

    public static final void b(uf5.k kVar, android.widget.Button button, java.util.Set set) {
        kVar.getClass();
        int size = set.size();
        android.app.Activity activity = kVar.f427254a;
        if (size > 0) {
            button.setText(activity.getString(com.tencent.mm.R.string.pa6, java.lang.Integer.valueOf(size)));
            button.setEnabled(true);
        } else {
            button.setText(activity.getString(com.tencent.mm.R.string.f493838pa4));
            button.setEnabled(false);
        }
    }
}
