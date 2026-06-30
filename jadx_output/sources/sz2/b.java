package sz2;

/* loaded from: classes.dex */
public class b extends androidx.appcompat.app.i0 {
    public b(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494143fd);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.aa9);
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        findViewById(com.tencent.mm.R.id.dnw).setOnClickListener(new sz2.a(this));
    }
}
