package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class f1 implements com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator {
    @Override // com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator
    public com.tencent.tav.extractor.IExtractorDelegate createExtractorDelegate() {
        return new com.tencent.tav.extractor.ApiExtractorDelegate();
    }
}
