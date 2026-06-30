package rz1;

/* loaded from: classes.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.KotlinSampleUI f401791d;

    public c(com.tencent.mm.plugin.datareport.sample.KotlinSampleUI kotlinSampleUI) {
        this.f401791d = kotlinSampleUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f401791d.finish();
        return true;
    }
}
