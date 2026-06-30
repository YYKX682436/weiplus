package mz2;

/* loaded from: classes3.dex */
public class f2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f333121d;

    public f2(mz2.j2 j2Var, android.widget.CheckBox checkBox) {
        this.f333121d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f333121d.isChecked()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
    }
}
