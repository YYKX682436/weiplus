package gb3;

/* loaded from: classes12.dex */
public abstract class q {
    public static void a(java.lang.StringBuilder sb6, com.tencent.mm.api.IEmojiInfo iEmojiInfo, int i17) {
        if (iEmojiInfo == null) {
            return;
        }
        sb6.append("<emoji>");
        sb6.append("<localreceivestatus>");
        sb6.append(i17);
        sb6.append("</localreceivestatus>");
        sb6.append("<md5>");
        sb6.append(ot0.q.g(iEmojiInfo.H0()));
        sb6.append("</md5>");
        sb6.append("<type>");
        sb6.append(iEmojiInfo.getType());
        sb6.append("</type>");
        sb6.append("<width>");
        sb6.append(iEmojiInfo.getWidth());
        sb6.append("</width>");
        sb6.append("<height>");
        sb6.append(iEmojiInfo.getHeight());
        sb6.append("</height>");
        sb6.append("<len>");
        sb6.append(iEmojiInfo.getSize());
        sb6.append("</len>");
        sb6.append("<aeskey>");
        sb6.append(ot0.q.g(iEmojiInfo.getAesKey()));
        sb6.append("</aeskey>");
        sb6.append("<cdnurl>");
        sb6.append(ot0.q.g(iEmojiInfo.l0()));
        sb6.append("</cdnurl>");
        sb6.append("<encrypturl>");
        sb6.append(ot0.q.g(iEmojiInfo.J1()));
        sb6.append("</encrypturl>");
        sb6.append("<externurl>");
        sb6.append(ot0.q.g(iEmojiInfo.Z()));
        sb6.append("</externurl>");
        sb6.append("<externmd5>");
        sb6.append(ot0.q.g(iEmojiInfo.g1()));
        sb6.append("</externmd5>");
        sb6.append("<productid>");
        sb6.append(ot0.q.g(iEmojiInfo.getGroupId()));
        sb6.append("</productid>");
        sb6.append("<designerid>");
        sb6.append(ot0.q.g(iEmojiInfo.X0()));
        sb6.append("</designerid>");
        sb6.append("<attachedtext>");
        sb6.append(ot0.q.g(iEmojiInfo.q0()));
        sb6.append("</attachedtext>");
        sb6.append("</emoji>");
    }
}
