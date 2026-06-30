package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/ting/VoiceRecognitionResult;", "", "texts", "", "", "voiceIdSet", "(Ljava/util/List;Ljava/util/List;)V", "getTexts", "()Ljava/util/List;", "getVoiceIdSet", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VoiceRecognitionResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.VoiceRecognitionResult.Companion INSTANCE = new com.tencent.pigeon.ting.VoiceRecognitionResult.Companion(null);
    private final java.util.List<java.lang.String> texts;
    private final java.util.List<java.lang.String> voiceIdSet;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/VoiceRecognitionResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/VoiceRecognitionResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.VoiceRecognitionResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.VoiceRecognitionResult((java.util.List) list.get(0), (java.util.List) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceRecognitionResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.ting.VoiceRecognitionResult copy$default(com.tencent.pigeon.ting.VoiceRecognitionResult voiceRecognitionResult, java.util.List list, java.util.List list2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = voiceRecognitionResult.texts;
        }
        if ((i17 & 2) != 0) {
            list2 = voiceRecognitionResult.voiceIdSet;
        }
        return voiceRecognitionResult.copy(list, list2);
    }

    public final java.util.List<java.lang.String> component1() {
        return this.texts;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.voiceIdSet;
    }

    public final com.tencent.pigeon.ting.VoiceRecognitionResult copy(java.util.List<java.lang.String> texts, java.util.List<java.lang.String> voiceIdSet) {
        return new com.tencent.pigeon.ting.VoiceRecognitionResult(texts, voiceIdSet);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.VoiceRecognitionResult)) {
            return false;
        }
        com.tencent.pigeon.ting.VoiceRecognitionResult voiceRecognitionResult = (com.tencent.pigeon.ting.VoiceRecognitionResult) other;
        return kotlin.jvm.internal.o.b(this.texts, voiceRecognitionResult.texts) && kotlin.jvm.internal.o.b(this.voiceIdSet, voiceRecognitionResult.voiceIdSet);
    }

    public final java.util.List<java.lang.String> getTexts() {
        return this.texts;
    }

    public final java.util.List<java.lang.String> getVoiceIdSet() {
        return this.voiceIdSet;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.texts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.List<java.lang.String> list2 = this.voiceIdSet;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.texts, this.voiceIdSet);
    }

    public java.lang.String toString() {
        return "VoiceRecognitionResult(texts=" + this.texts + ", voiceIdSet=" + this.voiceIdSet + ')';
    }

    public VoiceRecognitionResult(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.texts = list;
        this.voiceIdSet = list2;
    }

    public /* synthetic */ VoiceRecognitionResult(java.util.List list, java.util.List list2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : list, (i17 & 2) != 0 ? null : list2);
    }
}
