package zx2;

/* loaded from: classes2.dex */
public class y implements zx2.z {
    @Override // zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "onTabSelected : " + tab.f477040a);
    }

    @Override // zx2.z
    public void b(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "onTabUnSelected : " + tab.f477040a);
    }

    public void c(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "onTabConTabDoubleClicklick : " + tab.f477040a);
    }
}
