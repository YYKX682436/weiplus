package dn;

/* loaded from: classes12.dex */
public class o extends dn.m {
    public long D1;
    public java.lang.String E1;
    public java.lang.String F1;
    public int G1;
    public int H1;
    public java.lang.String I1;
    public java.lang.String J1;
    public int K1;
    public int L1;
    public java.lang.String M1;
    public java.lang.String N1;
    public long O1 = 0;
    public long P1 = 0;
    public java.lang.String Q1 = "";
    public boolean R1 = false;
    public java.lang.String S1 = "";
    public java.lang.String T1 = "";
    public java.lang.String U1 = "";
    public int V1 = 0;
    public long W1 = 0;
    public java.lang.String X1;
    public java.lang.String Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f241813a2;

    /* renamed from: b2, reason: collision with root package name */
    public java.lang.String f241814b2;

    /* renamed from: c2, reason: collision with root package name */
    public dn.n f241815c2;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("{isPlayMode: ");
        stringBuffer.append(this.H1);
        stringBuffer.append(" videoFormat: ");
        stringBuffer.append(this.field_requestVideoFormat);
        stringBuffer.append(" initialDownloadLength : ");
        stringBuffer.append(this.f241803v);
        stringBuffer.append(" initialDownloadOffset : ");
        stringBuffer.append(this.f241804w);
        stringBuffer.append(" videoXmlTotalLen : ");
        stringBuffer.append(this.G1);
        stringBuffer.append(" videoTaskType : ");
        stringBuffer.append(this.Z);
        stringBuffer.append(" filename : ");
        stringBuffer.append(this.E1);
        if (i()) {
            stringBuffer.append(" url : ");
            stringBuffer.append(this.M1);
            stringBuffer.append(" host : null referer : ");
            stringBuffer.append(this.N1);
            stringBuffer.append(" ip size : ");
            stringBuffer.append(0);
            stringBuffer.append(" isColdSnsData : ");
            stringBuffer.append(this.R1);
            stringBuffer.append(" signalQuality : ");
            stringBuffer.append(this.S1);
            stringBuffer.append(" snsScene : ");
            stringBuffer.append(this.T1);
            stringBuffer.append(" snsId : ");
            stringBuffer.append(this.Q1);
        } else {
            stringBuffer.append(" field_mediaId : ");
            stringBuffer.append(this.field_mediaId);
        }
        stringBuffer.append(" fileid : ");
        stringBuffer.append(this.field_fileId);
        stringBuffer.append(" fileaeskey: ");
        stringBuffer.append(this.field_aesKey);
        stringBuffer.append(" field_preloadRatio:");
        stringBuffer.append(this.field_preloadRatio);
        stringBuffer.append(" newmd5: ");
        stringBuffer.append(this.U1);
        stringBuffer.append(" snsCipherKey: ");
        stringBuffer.append(this.Y1);
        stringBuffer.append(" snsMediaId: ");
        stringBuffer.append(this.f241814b2);
        stringBuffer.append(" concurrentCount: ");
        stringBuffer.append(this.f241809y0);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
