package qx5;

/* loaded from: classes13.dex */
public class h0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx5.y f367495e;

    public h0(qx5.y yVar, java.lang.String str) {
        this.f367495e = yVar;
        this.f367494d = str;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        qx5.y yVar = this.f367495e;
        by5.a1.b(yVar.getContext(), "xweb_debug_info", this.f367494d);
        android.widget.Toast.makeText(yVar.getContext(), "已复制到剪贴板", 0).show();
        return true;
    }
}
