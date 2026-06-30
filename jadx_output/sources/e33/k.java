package e33;

/* loaded from: classes10.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f247299d;

    public k(e33.b0 b0Var, android.view.View view) {
        this.f247299d = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.View view = this.f247299d;
        if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
            ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(false);
        }
    }
}
