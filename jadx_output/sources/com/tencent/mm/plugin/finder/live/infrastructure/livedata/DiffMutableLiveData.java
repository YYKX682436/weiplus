package com.tencent.mm.plugin.finder.live.infrastructure.livedata;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB+\b\u0016\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/DiffMutableLiveData;", "", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/LiveMutableData;", "Lkotlin/Function2;", "", "isSame", "<init>", "(Lyz5/p;)V", "zg2/e", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DiffMutableLiveData<T> extends com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<T> {

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f111659e;

    public DiffMutableLiveData(yz5.p pVar) {
        this.f111659e = pVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData, androidx.lifecycle.g0
    public void observe(androidx.lifecycle.y owner, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        super.observe(owner, new zg2.e(this, observer));
    }

    @Override // androidx.lifecycle.g0
    public void observeForever(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.observeForever(new zg2.e(this, observer));
    }

    public /* synthetic */ DiffMutableLiveData(yz5.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : pVar);
    }
}
