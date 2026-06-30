package cw2;

/* loaded from: classes10.dex */
public final class a implements com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator {
    @Override // com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator
    public com.tencent.tav.extractor.IExtractorDelegate createExtractorDelegate() {
        return new com.tencent.tav.extractor.ApiExtractorDelegate();
    }
}
