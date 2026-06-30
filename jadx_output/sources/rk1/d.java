package rk1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.g f396400a;

    /* renamed from: b, reason: collision with root package name */
    public final long f396401b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f396402c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct f396403d;

    public d(com.tencent.mm.plugin.appbrand.jsruntime.g jsEngine, long j17, java.nio.ByteBuffer byteBuffer, com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct) {
        kotlin.jvm.internal.o.g(jsEngine, "jsEngine");
        this.f396400a = jsEngine;
        this.f396401b = j17;
        this.f396402c = byteBuffer;
        this.f396403d = weAppQualityWasmCachePrecompileStruct;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1.d)) {
            return false;
        }
        rk1.d dVar = (rk1.d) obj;
        return kotlin.jvm.internal.o.b(this.f396400a, dVar.f396400a) && this.f396401b == dVar.f396401b && kotlin.jvm.internal.o.b(this.f396402c, dVar.f396402c) && kotlin.jvm.internal.o.b(this.f396403d, dVar.f396403d);
    }

    public int hashCode() {
        int hashCode = ((this.f396400a.hashCode() * 31) + java.lang.Long.hashCode(this.f396401b)) * 31;
        java.nio.ByteBuffer byteBuffer = this.f396402c;
        int hashCode2 = (hashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 31;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = this.f396403d;
        return hashCode2 + (weAppQualityWasmCachePrecompileStruct != null ? weAppQualityWasmCachePrecompileStruct.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TaskData(jsEngine=" + this.f396400a + ", task=" + this.f396401b + ", funcList=" + this.f396402c + ", reportStruct=" + this.f396403d + ')';
    }
}
