package mm2;

/* loaded from: classes3.dex */
public final class w5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f329513f;

    /* renamed from: g, reason: collision with root package name */
    public int f329514g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f329515h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f329516i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f329517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329513f = -1;
        this.f329514g = -1;
        this.f329515h = "";
        this.f329516i = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    public final void N6() {
        synchronized (this.f329516i) {
            com.tencent.mars.xlog.Log.i("LiveSEISeqSlice", "clearCurrentSEIInfo curMinSEISeq: " + this.f329513f + " curMaxSEISeq: " + this.f329514g + " size: " + this.f329516i.size());
            this.f329516i.clear();
        }
        this.f329513f = -1;
        this.f329514g = -1;
        com.tencent.mars.xlog.Log.i("LiveSEISeqSlice", "set switch stream: false");
        this.f329517m = false;
    }

    public final java.lang.String O6(java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("size: " + map.size() + ", [ ");
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append("seq: " + ((r45.l66) ((java.util.Map.Entry) it.next()).getValue()).getLong(1) + ' ');
        }
        sb6.append(" ]");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        N6();
    }
}
