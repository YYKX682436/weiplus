package d45;

/* loaded from: classes10.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f226451d;

    public n(android.view.View view) {
        this.f226451d = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        android.view.View view = this.f226451d;
        if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
            ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(false);
        }
    }
}
