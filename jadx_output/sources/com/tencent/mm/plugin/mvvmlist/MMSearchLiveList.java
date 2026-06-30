package com.tencent.mm.plugin.mvvmlist;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004BQ\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Lxm3/d;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Q", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lym3/b;", "searchDataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lym3/b;Lxm3/n0;Landroidx/lifecycle/y;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class MMSearchLiveList<T extends xm3.d, Q> extends com.tencent.mm.plugin.mvvmlist.MvvmList<T> {
    public final ym3.b A;
    public kotlinx.coroutines.r2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMSearchLiveList(ym3.f dataSource, ym3.b searchDataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner) {
        super(dataSource, config, lifecycleOwner, null, null, 24, null);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(searchDataSource, "searchDataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.A = searchDataSource;
    }

    public final void D(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        kotlinx.coroutines.r2 r2Var2 = this.B;
        boolean z17 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z17 = true;
        }
        if (z17 && (r2Var = this.B) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.B = v65.i.b(this.f152060g, null, new xm3.f(this, obj, null), 1, null);
    }
}
