package h93;

/* loaded from: classes11.dex */
public abstract class c extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f279694d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f279695e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f279696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279696f = jz5.h.b(new h93.b(activity));
    }

    public abstract java.lang.Object O6();

    public abstract int P6();

    public final h93.k Q6() {
        return (h93.k) ((jz5.n) this.f279696f).getValue();
    }

    public abstract java.lang.String R6();

    public void S6() {
        java.lang.Object O6 = O6();
        if (O6 instanceof com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) {
            com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) O6;
            mMLabelPanel.setTagNormalBG(com.tencent.mm.R.drawable.f481905d60);
            mMLabelPanel.setTagSelectedBG(com.tencent.mm.R.drawable.f481906d61);
            mMLabelPanel.setTagNormalTextColorRes(com.tencent.mm.R.color.FG_1);
            mMLabelPanel.setCallBack(new h93.a(this));
        }
    }

    public void T6(java.util.ArrayList selectedList) {
        kotlin.jvm.internal.o.g(selectedList, "selectedList");
    }

    public abstract void U6(java.lang.String str, java.util.List list);

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f279694d = getIntent().getStringExtra("label_username");
        getIntent().getBooleanExtra("is_stranger", false);
        this.f279695e = getIntent().getStringExtra("Contact_ReportSessionId");
        S6();
    }
}
