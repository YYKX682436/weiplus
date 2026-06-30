package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public final class Tile {
    public static com.tencent.tencentmap.mapsdk.maps.model.Tile EMPTY_TILE = new com.tencent.tencentmap.mapsdk.maps.model.Tile(-1, -1, getNoTileData());
    public final byte[] mData;
    public final int mHeight;
    public final int mWidth;

    public Tile(int i17, int i18, byte[] bArr) {
        this.mWidth = i17;
        this.mHeight = i18;
        this.mData = bArr;
    }

    private static byte[] getNoTileData() {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(256, 256, android.graphics.Bitmap.Config.ARGB_8888);
        new android.graphics.Canvas(createBitmap).drawARGB(0, 255, 255, 255);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] getData() {
        return this.mData;
    }
}
