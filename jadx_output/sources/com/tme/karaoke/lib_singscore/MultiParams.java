package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tme/karaoke/lib_singscore/MultiParams;", "", "template", "", "skillTemplate", "resultMap", "([B[B[B)V", "getResultMap", "()[B", "getSkillTemplate", "getTemplate", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiParams {
    private final byte[] resultMap;
    private final byte[] skillTemplate;
    private final byte[] template;

    public MultiParams(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.template = bArr;
        this.skillTemplate = bArr2;
        this.resultMap = bArr3;
    }

    public final byte[] getResultMap() {
        return this.resultMap;
    }

    public final byte[] getSkillTemplate() {
        return this.skillTemplate;
    }

    public final byte[] getTemplate() {
        return this.template;
    }
}
