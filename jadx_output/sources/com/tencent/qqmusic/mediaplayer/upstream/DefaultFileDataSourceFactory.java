package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class DefaultFileDataSourceFactory implements com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory {
    private final java.lang.String filePath;

    public DefaultFileDataSourceFactory(java.lang.String str) {
        this.filePath = str;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
    public com.tencent.qqmusic.mediaplayer.upstream.IDataSource createDataSource() {
        if (android.text.TextUtils.isEmpty(this.filePath)) {
            throw new com.tencent.qqmusic.mediaplayer.upstream.DataSourceException(-5, "filePath is empty!", null);
        }
        return new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(this.filePath);
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
    public com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource createNativeDataSource() {
        return com.tencent.qqmusic.mediaplayer.upstream.NativeDataSourceFactory.fileDataSource(this.filePath, 0);
    }
}
