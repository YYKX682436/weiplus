package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/wexnet/TensorCpuB;", "", "dateType", "", "dataShape", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljava/nio/ByteBuffer;", "(I[ILjava/nio/ByteBuffer;)V", "getData", "()Ljava/nio/ByteBuffer;", "getDataShape", "()[I", "getDateType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TensorCpuB {
    private final java.nio.ByteBuffer data;
    private final int[] dataShape;
    private final int dateType;

    public TensorCpuB(int i17, int[] dataShape, java.nio.ByteBuffer data) {
        kotlin.jvm.internal.o.g(dataShape, "dataShape");
        kotlin.jvm.internal.o.g(data, "data");
        this.dateType = i17;
        this.dataShape = dataShape;
        this.data = data;
    }

    public static /* synthetic */ com.tencent.mm.wexnet.TensorCpuB copy$default(com.tencent.mm.wexnet.TensorCpuB tensorCpuB, int i17, int[] iArr, java.nio.ByteBuffer byteBuffer, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = tensorCpuB.dateType;
        }
        if ((i18 & 2) != 0) {
            iArr = tensorCpuB.dataShape;
        }
        if ((i18 & 4) != 0) {
            byteBuffer = tensorCpuB.data;
        }
        return tensorCpuB.copy(i17, iArr, byteBuffer);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDateType() {
        return this.dateType;
    }

    /* renamed from: component2, reason: from getter */
    public final int[] getDataShape() {
        return this.dataShape;
    }

    /* renamed from: component3, reason: from getter */
    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    public final com.tencent.mm.wexnet.TensorCpuB copy(int dateType, int[] dataShape, java.nio.ByteBuffer data) {
        kotlin.jvm.internal.o.g(dataShape, "dataShape");
        kotlin.jvm.internal.o.g(data, "data");
        return new com.tencent.mm.wexnet.TensorCpuB(dateType, dataShape, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.mm.wexnet.TensorCpuB)) {
            return false;
        }
        com.tencent.mm.wexnet.TensorCpuB tensorCpuB = (com.tencent.mm.wexnet.TensorCpuB) other;
        return this.dateType == tensorCpuB.dateType && kotlin.jvm.internal.o.b(this.dataShape, tensorCpuB.dataShape) && kotlin.jvm.internal.o.b(this.data, tensorCpuB.data);
    }

    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    public final int[] getDataShape() {
        return this.dataShape;
    }

    public final int getDateType() {
        return this.dateType;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.dateType) * 31) + java.util.Arrays.hashCode(this.dataShape)) * 31) + this.data.hashCode();
    }

    public java.lang.String toString() {
        return "TensorCpuB(dateType=" + this.dateType + ", dataShape=" + java.util.Arrays.toString(this.dataShape) + ", data=" + this.data + ')';
    }
}
