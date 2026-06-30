package com.tencent.mm.plugin.finder.live.infrastructure.livedata;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/LiveMutableData;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/j0;", "Landroidx/lifecycle/v;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class LiveMutableData<T> extends androidx.lifecycle.j0 implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public boolean f111660d = true;

    @Override // androidx.lifecycle.g0
    public void observe(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        owner.mo133getLifecycle().a(this);
        super.observe(owner, new zg2.g(this, observer));
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (zg2.f.f472826a[event.ordinal()] == 1) {
            this.f111660d = true;
            source.mo133getLifecycle().c(this);
        }
    }

    @Override // androidx.lifecycle.j0, androidx.lifecycle.g0
    public void setValue(java.lang.Object obj) {
        this.f111660d = false;
        super.setValue(obj);
    }
}
