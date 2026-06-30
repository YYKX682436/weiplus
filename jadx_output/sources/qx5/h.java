package qx5;

/* loaded from: classes13.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.debug.FragmentLog f367493d;

    public h(com.tencent.xweb.debug.FragmentLog fragmentLog) {
        this.f367493d = fragmentLog;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.xweb.debug.FragmentLog fragmentLog = this.f367493d;
        by5.a1.b(fragmentLog.getContext(), "xweb_debug_info", fragmentLog.f220250d.getText().toString());
        android.widget.Toast.makeText(fragmentLog.getContext(), "已复制到剪贴板", 0).show();
        return true;
    }
}
