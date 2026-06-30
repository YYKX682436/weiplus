package r45;

/* loaded from: classes12.dex */
public class lu6 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public lu6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "ClientImgId", r45.du5.class), com.tencent.mm.protobuf.i.r(3, "FromUserName", r45.du5.class), com.tencent.mm.protobuf.i.r(4, "ToUserName", r45.du5.class), com.tencent.mm.protobuf.i.i(5, "TotalLen"), com.tencent.mm.protobuf.i.i(6, "StartPos"), com.tencent.mm.protobuf.i.i(7, "DataLen"), com.tencent.mm.protobuf.i.r(8, "ImgData", r45.cu5.class), com.tencent.mm.protobuf.i.i(9, "MsgType"), com.tencent.mm.protobuf.i.u(10, "MsgSource"), com.tencent.mm.protobuf.i.i(11, "CompressType"), com.tencent.mm.protobuf.i.i(12, "NetType"), com.tencent.mm.protobuf.i.i(13, "PhotoFrom"), com.tencent.mm.protobuf.i.u(14, "MediaId"), com.tencent.mm.protobuf.i.u(15, "CDNBigImgUrl"), com.tencent.mm.protobuf.i.u(16, "CDNMidImgUrl"), com.tencent.mm.protobuf.i.u(17, "AESKey"), com.tencent.mm.protobuf.i.i(18, "EncryVer"), com.tencent.mm.protobuf.i.i(19, "CDNBigImgSize"), com.tencent.mm.protobuf.i.i(20, "CDNMidImgSize"), com.tencent.mm.protobuf.i.u(21, "CDNThumbImgUrl"), com.tencent.mm.protobuf.i.i(22, "CDNThumbImgSize"), com.tencent.mm.protobuf.i.i(23, "CDNThumbImgHeight"), com.tencent.mm.protobuf.i.i(24, "CDNThumbImgWidth"), com.tencent.mm.protobuf.i.u(25, "CDNThumbAESKey"), com.tencent.mm.protobuf.i.i(26, "ReqTime"), com.tencent.mm.protobuf.i.u(27, "Md5"), com.tencent.mm.protobuf.i.i(28, "CRC32"), com.tencent.mm.protobuf.i.i(29, "MsgForwardType"), com.tencent.mm.protobuf.i.i(30, "HitMd5"), com.tencent.mm.protobuf.i.u(31, "AppId"), com.tencent.mm.protobuf.i.u(32, "MessageAction"), com.tencent.mm.protobuf.i.u(33, "MessageExt"), com.tencent.mm.protobuf.i.u(34, "MediaTagName"), com.tencent.mm.protobuf.i.u(35, "SendMsgTicket"), com.tencent.mm.protobuf.i.i(36, "ImgType"), com.tencent.mm.protobuf.i.u(37, "ImgInfo"), com.tencent.mm.protobuf.i.u(38, "PlatformSignature"), com.tencent.mm.protobuf.i.u(39, "ImgDataHash"), com.tencent.mm.protobuf.i.u(40, "ImgSourceUrl"), com.tencent.mm.protobuf.i.i(41, "HevcMidSize"), com.tencent.mm.protobuf.i.u(42, "RawMd5"), com.tencent.mm.protobuf.i.u(43, "OriginSourceMd5"), com.tencent.mm.protobuf.i.r(44, "ImgSourceInfo", r45.gz3.class), com.tencent.mm.protobuf.i.r(45, "ImgWxaInfo", r45.hz3.class), com.tencent.mm.protobuf.i.u(47, "SecHashInfoBase64"), com.tencent.mm.protobuf.i.i(49, "LiveDuration"), com.tencent.mm.protobuf.i.i(50, "LiveVideoSize"), com.tencent.mm.protobuf.i.u(51, "LiveVideoMd5"), com.tencent.mm.protobuf.i.u(52, "LiveVideoFileid"), com.tencent.mm.protobuf.i.i(53, "LiveHDVideoSize"), com.tencent.mm.protobuf.i.u(54, "LiveHDVideoMd5"), com.tencent.mm.protobuf.i.u(55, "LiveHDVideoFileid"), com.tencent.mm.protobuf.i.u(56, "ExtCommonInfoXml"), com.tencent.mm.protobuf.i.r(57, "ImgMpInfo", r45.ez3.class), com.tencent.mm.protobuf.i.i(58, "LivePhotoStillImageTimeMs"));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
