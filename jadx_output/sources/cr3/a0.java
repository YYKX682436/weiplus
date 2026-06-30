package cr3;

/* loaded from: classes11.dex */
public class a0 implements com.tencent.mm.chatroom.ui.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221923a;

    public a0(cr3.d0 d0Var) {
        this.f221923a = d0Var;
    }

    @Override // com.tencent.mm.chatroom.ui.b1
    public void a(android.widget.CheckBox checkBox) {
        checkBox.setText(com.tencent.mm.R.string.ndh);
    }

    @Override // com.tencent.mm.chatroom.ui.b1
    public void b(android.widget.CheckBox checkBox) {
        boolean isChecked = checkBox.isChecked();
        cr3.d0 d0Var = this.f221923a;
        d0Var.f221932e.d1();
        cr3.d0.b(d0Var, isChecked);
        if (d0Var.f221932e.getSource() == 18) {
            d0Var.f221933f = 9;
        }
    }
}
