package com.tencent.mm.xeffect;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0086 J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086 J\u0011\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 ¨\u0006\f"}, d2 = {"Lcom/tencent/mm/xeffect/InputAnimation;", "", "", "nInit", "ptr", "startMs", "endMs", "", "interpolator", "Ljz5/f0;", "nUpdate", "nDestroy", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class InputAnimation {

    /* renamed from: a, reason: collision with root package name */
    public final long f214789a = nInit();

    /* renamed from: b, reason: collision with root package name */
    public long f214790b;

    /* renamed from: c, reason: collision with root package name */
    public long f214791c;

    public final void finalize() {
        nDestroy(this.f214789a);
    }

    public final native void nDestroy(long j17);

    public final native long nInit();

    public final native void nUpdate(long j17, long j18, long j19, int i17);
}
