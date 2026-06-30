package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0015\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0085\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tencent/mm/wexnet/Options;", "", "numThreads", "", "cachePath", "", "allowQuantize", "", "allowGPU", "allowNPU", "precisionLevel", "typicalShape", "", "", "typicalDataFile", "useNpuOnly", "npuLibsPath", "(ILjava/lang/String;ZZZILjava/util/Map;Ljava/util/Map;ZLjava/lang/String;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Options {
    public boolean allowGPU;
    public boolean allowNPU;
    public boolean allowQuantize;
    public java.lang.String cachePath;
    public java.lang.String npuLibsPath;
    public int numThreads;
    public int precisionLevel;
    public java.util.Map<java.lang.String, java.lang.String> typicalDataFile;
    public java.util.Map<java.lang.String, int[]> typicalShape;
    public boolean useNpuOnly;

    public Options(int i17, java.lang.String cachePath, boolean z17, boolean z18, boolean z19, int i18, java.util.Map<java.lang.String, int[]> typicalShape, java.util.Map<java.lang.String, java.lang.String> typicalDataFile, boolean z27, java.lang.String npuLibsPath) {
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        kotlin.jvm.internal.o.g(typicalShape, "typicalShape");
        kotlin.jvm.internal.o.g(typicalDataFile, "typicalDataFile");
        kotlin.jvm.internal.o.g(npuLibsPath, "npuLibsPath");
        this.numThreads = i17;
        this.cachePath = cachePath;
        this.allowQuantize = z17;
        this.allowGPU = z18;
        this.allowNPU = z19;
        this.precisionLevel = i18;
        this.typicalShape = typicalShape;
        this.typicalDataFile = typicalDataFile;
        this.useNpuOnly = z27;
        this.npuLibsPath = npuLibsPath;
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumThreads() {
        return this.numThreads;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getNpuLibsPath() {
        return this.npuLibsPath;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCachePath() {
        return this.cachePath;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowQuantize() {
        return this.allowQuantize;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowGPU() {
        return this.allowGPU;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAllowNPU() {
        return this.allowNPU;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPrecisionLevel() {
        return this.precisionLevel;
    }

    public final java.util.Map<java.lang.String, int[]> component7() {
        return this.typicalShape;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component8() {
        return this.typicalDataFile;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUseNpuOnly() {
        return this.useNpuOnly;
    }

    public final com.tencent.mm.wexnet.Options copy(int numThreads, java.lang.String cachePath, boolean allowQuantize, boolean allowGPU, boolean allowNPU, int precisionLevel, java.util.Map<java.lang.String, int[]> typicalShape, java.util.Map<java.lang.String, java.lang.String> typicalDataFile, boolean useNpuOnly, java.lang.String npuLibsPath) {
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        kotlin.jvm.internal.o.g(typicalShape, "typicalShape");
        kotlin.jvm.internal.o.g(typicalDataFile, "typicalDataFile");
        kotlin.jvm.internal.o.g(npuLibsPath, "npuLibsPath");
        return new com.tencent.mm.wexnet.Options(numThreads, cachePath, allowQuantize, allowGPU, allowNPU, precisionLevel, typicalShape, typicalDataFile, useNpuOnly, npuLibsPath);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.mm.wexnet.Options)) {
            return false;
        }
        com.tencent.mm.wexnet.Options options = (com.tencent.mm.wexnet.Options) other;
        return this.numThreads == options.numThreads && kotlin.jvm.internal.o.b(this.cachePath, options.cachePath) && this.allowQuantize == options.allowQuantize && this.allowGPU == options.allowGPU && this.allowNPU == options.allowNPU && this.precisionLevel == options.precisionLevel && kotlin.jvm.internal.o.b(this.typicalShape, options.typicalShape) && kotlin.jvm.internal.o.b(this.typicalDataFile, options.typicalDataFile) && this.useNpuOnly == options.useNpuOnly && kotlin.jvm.internal.o.b(this.npuLibsPath, options.npuLibsPath);
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.numThreads) * 31) + this.cachePath.hashCode()) * 31) + java.lang.Boolean.hashCode(this.allowQuantize)) * 31) + java.lang.Boolean.hashCode(this.allowGPU)) * 31) + java.lang.Boolean.hashCode(this.allowNPU)) * 31) + java.lang.Integer.hashCode(this.precisionLevel)) * 31) + this.typicalShape.hashCode()) * 31) + this.typicalDataFile.hashCode()) * 31) + java.lang.Boolean.hashCode(this.useNpuOnly)) * 31) + this.npuLibsPath.hashCode();
    }

    public java.lang.String toString() {
        return "Options(numThreads=" + this.numThreads + ", cachePath=" + this.cachePath + ", allowQuantize=" + this.allowQuantize + ", allowGPU=" + this.allowGPU + ", allowNPU=" + this.allowNPU + ", precisionLevel=" + this.precisionLevel + ", typicalShape=" + this.typicalShape + ", typicalDataFile=" + this.typicalDataFile + ", useNpuOnly=" + this.useNpuOnly + ", npuLibsPath=" + this.npuLibsPath + ')';
    }

    public /* synthetic */ Options(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19, int i18, java.util.Map map, java.util.Map map2, boolean z27, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? 1 : i17, str, (i19 & 4) != 0 ? false : z17, (i19 & 8) != 0 ? false : z18, (i19 & 16) != 0 ? false : z19, (i19 & 32) != 0 ? 4 : i18, (i19 & 64) != 0 ? new java.util.HashMap() : map, (i19 & 128) != 0 ? new java.util.HashMap() : map2, (i19 & 256) != 0 ? false : z27, str2);
    }
}
