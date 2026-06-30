package com.tencent.mm.protocal.protobuf;

/* loaded from: classes10.dex */
public class FinderMediaExtra extends com.tencent.mm.protobuf.e {
    public FinderMediaExtra() {
        super(com.tencent.mm.protobuf.i.u(1, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT), com.tencent.mm.protobuf.i.w(2, "cover_url_word"), com.tencent.mm.protobuf.i.i(3, "is_realshoot"), com.tencent.mm.protobuf.i.w(4, "share_cover_url_word"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderMediaExtra create() {
        return new com.tencent.mm.protocal.protobuf.FinderMediaExtra();
    }

    public com.tencent.mm.protocal.protobuf.FinderMediaExtra addElementCover_url_word(java.lang.String str) {
        addElement(1, str);
        return this;
    }

    public com.tencent.mm.protocal.protobuf.FinderMediaExtra addElementShare_cover_url_word(java.lang.String str) {
        addElement(3, str);
        return this;
    }

    public final java.util.LinkedList<java.lang.String> getCover_url_word() {
        return getList(1);
    }

    public final int getIs_realshoot() {
        return getInteger(2);
    }

    public final java.util.LinkedList<java.lang.String> getShare_cover_url_word() {
        return getList(3);
    }

    public final java.lang.String getText() {
        return getString(0);
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaExtra setCover_url_word(java.util.LinkedList<java.lang.String> linkedList) {
        set(1, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaExtra setIs_realshoot(int i17) {
        set(2, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaExtra setShare_cover_url_word(java.util.LinkedList<java.lang.String> linkedList) {
        set(3, linkedList);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderMediaExtra setText(java.lang.String str) {
        set(0, str);
        return this;
    }
}
