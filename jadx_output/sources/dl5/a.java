package dl5;

/* loaded from: classes3.dex */
public class a extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f235510d;

    public a(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488232ns, this);
        this.f235510d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
    }

    public void setTitle(java.lang.String str) {
        this.f235510d.setText(str);
    }
}
