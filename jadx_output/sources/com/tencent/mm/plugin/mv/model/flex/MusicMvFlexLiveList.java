package com.tencent.mm.plugin.mv.model.flex;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/mv/model/flex/MusicMvFlexLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lgm3/c;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvFlexLiveList extends com.tencent.mm.plugin.mvvmlist.MvvmList<gm3.c> {
    public final u26.k0 A;
    public final kotlinx.coroutines.flow.j B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvFlexLiveList(ym3.f dataSource, xm3.n0 config, androidx.lifecycle.y lifecycleOwner) {
        super(dataSource, config, lifecycleOwner, null, null, 24, null);
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f152071u.observe(this, new gm3.d(this));
        u26.k0 k0Var = new u26.k0();
        this.A = k0Var;
        this.B = new kotlinx.coroutines.flow.r(k0Var);
    }

    public final void D() {
        z(gm3.e.f273552d);
    }
}
