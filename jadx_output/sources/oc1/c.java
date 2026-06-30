package oc1;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344143e;

    public c(android.content.Context context, java.lang.String str) {
        this.f344142d = context;
        this.f344143e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f344142d;
        android.widget.Toast makeText = dp.a.makeText(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(this.f344143e);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }
}
