package com.tencent.tav.extractor;

/* loaded from: classes10.dex */
public class ExtractorDelegateFactory {
    private static com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator extractorDelegateCreator = new com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator() { // from class: com.tencent.tav.extractor.ExtractorDelegateFactory.1
        @Override // com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator
        public com.tencent.tav.extractor.IExtractorDelegate createExtractorDelegate() {
            return new com.tencent.tav.extractor.ApiExtractorDelegate();
        }
    };

    /* loaded from: classes10.dex */
    public interface IExtractorDelegateCreator {
        com.tencent.tav.extractor.IExtractorDelegate createExtractorDelegate();
    }

    public static com.tencent.tav.extractor.IExtractorDelegate createDelegate() {
        return extractorDelegateCreator.createExtractorDelegate();
    }

    public static void setExtractorDelegateCreator(com.tencent.tav.extractor.ExtractorDelegateFactory.IExtractorDelegateCreator iExtractorDelegateCreator) {
        extractorDelegateCreator = iExtractorDelegateCreator;
    }
}
