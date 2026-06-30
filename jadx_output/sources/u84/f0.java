package u84;

/* loaded from: classes4.dex */
public abstract class f0 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final kotlinx.coroutines.r0 G;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final android.graphics.drawable.GradientDrawable E;
    public float F;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f425517o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f425518p;

    /* renamed from: q, reason: collision with root package name */
    public final int f425519q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f425520r;

    /* renamed from: s, reason: collision with root package name */
    public final i64.b1 f425521s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f425522t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f425523u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f425524v;

    /* renamed from: w, reason: collision with root package name */
    public u84.h0 f425525w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f425526x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f425527y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f425528z;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        G = new u84.d0(kotlinx.coroutines.q0.f310567d);
    }

    public f0(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, boolean z17, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        super(str, yVar, view);
        this.f425517o = view;
        this.f425518p = viewGroup;
        this.f425519q = i17;
        this.f425520r = z17;
        this.f425521s = b1Var;
        this.f425522t = iVar;
        this.f425526x = jz5.h.b(new u84.v(this));
        this.f425527y = jz5.h.b(new u84.u(this));
        this.f425528z = jz5.h.b(new u84.w(this));
        this.A = jz5.h.b(new u84.s(this));
        this.B = jz5.h.b(new u84.t(this));
        this.C = jz5.h.b(new u84.r(this));
        jz5.g b17 = jz5.h.b(new u84.o(this));
        this.D = b17;
        jz5.g b18 = jz5.h.b(new u84.e0(this));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        java.lang.Integer num = (java.lang.Integer) ((jz5.n) b17).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStrokeColor", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        java.lang.Integer num2 = (java.lang.Integer) ((jz5.n) b18).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStrokeColor", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        if (num2 != null) {
            gradientDrawable.setStroke(i65.a.b(view != null ? view.getContext() : null, 1), num2.intValue());
        }
        this.E = gradientDrawable;
    }

    public static final /* synthetic */ android.view.View y(u84.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdHotDiscussedBar$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.view.View view = f0Var.f425523u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdHotDiscussedBar$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        return view;
    }

    public final android.widget.FrameLayout A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHeadImageListContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHeadImageListContainer", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        return frameLayout;
    }

    public final android.widget.TextView B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLabelTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f425527y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLabelTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        return textView;
    }

    public final android.widget.TextView C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTitleTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f425528z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTitleTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        return textView;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(72:15|(1:17)(1:342)|(1:341)(1:21)|22|(2:24|(1:26))(8:300|(3:302|(1:304)(1:306)|305)|307|(3:309|(6:311|(2:313|(4:315|316|(1:318)(1:321)|319))|322|316|(0)(0)|319)(6:323|(2:325|(4:327|328|(1:330)(1:332)|331))|333|328|(0)(0)|331)|320)|334|(1:336)(1:340)|337|(1:339))|27|(3:29|(1:31)(1:33)|32)|34|(3:36|(6:38|(2:40|(4:42|43|(1:45)(1:48)|46))|49|43|(0)(0)|46)(6:50|(2:52|(4:54|55|(1:57)(1:59)|58))|60|55|(0)(0)|58)|47)|61|(1:63)(1:299)|64|(3:66|(1:68)(1:70)|69)|71|(3:73|(6:75|(2:77|(4:79|80|(1:82)(1:85)|83))|86|80|(0)(0)|83)(6:87|(2:89|(4:91|92|(1:94)(1:96)|95))|97|92|(0)(0)|95)|84)|98|(1:100)|101|(1:103)|104|105|106|107|(3:108|109|(1:111)(1:293))|(47:116|117|(3:119|(1:290)(3:123|(1:125)(1:289)|126)|127)(1:291)|128|(1:130)(1:288)|(41:135|(2:269|(42:271|272|273|(40:275|(2:277|278)(1:282)|279|280|140|141|142|143|(1:145)(1:263)|146|(1:148)(1:262)|(1:150)|151|(1:153)(1:261)|154|(1:156)(1:260)|(1:158)|159|(2:161|(21:163|(5:165|(2:(2:170|171)(2:173|174)|172)|177|(4:179|180|181|182)(1:255)|183)(1:257)|184|(1:186)(1:251)|(12:188|(1:190)(1:249)|191|(1:193)(1:248)|194|(1:196)(1:247)|197|(1:199)(1:246)|200|(1:202)(1:245)|203|(5:205|(1:207)(1:214)|208|(1:210)(1:213)|(1:212)))(1:250)|215|(1:217)(1:244)|218|(1:220)(1:243)|(1:222)|223|(1:225)(1:242)|226|(1:228)(1:241)|(1:230)|232|(1:234)|(1:236)|237|(1:239)|240))(1:259)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240)|138|139|140|141|142|143|(0)(0)|146|(0)(0)|(0)|151|(0)(0)|154|(0)(0)|(0)|159|(0)(0)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240))|137|138|139|140|141|142|143|(0)(0)|146|(0)(0)|(0)|151|(0)(0)|154|(0)(0)|(0)|159|(0)(0)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240)|287|(0)|137|138|139|140|141|142|143|(0)(0)|146|(0)(0)|(0)|151|(0)(0)|154|(0)(0)|(0)|159|(0)(0)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240)|292|117|(0)(0)|128|(0)(0)|(42:132|135|(0)|137|138|139|140|141|142|143|(0)(0)|146|(0)(0)|(0)|151|(0)(0)|154|(0)(0)|(0)|159|(0)(0)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240)|287|(0)|137|138|139|140|141|142|143|(0)(0)|146|(0)(0)|(0)|151|(0)(0)|154|(0)(0)|(0)|159|(0)(0)|258|(0)(0)|184|(0)(0)|(0)(0)|215|(0)(0)|218|(0)(0)|(0)|223|(0)(0)|226|(0)(0)|(0)|232|(0)|(0)|237|(0)|240) */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f0 A[Catch: all -> 0x04fc, TryCatch #5 {all -> 0x04fc, blocks: (B:109:0x02ca, B:111:0x02da, B:113:0x02e2, B:119:0x02f0, B:121:0x02f6, B:123:0x02fc, B:125:0x0302, B:126:0x0309, B:127:0x0314, B:128:0x031d, B:130:0x0323, B:132:0x032c, B:269:0x033f), top: B:108:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0323 A[Catch: all -> 0x04fc, TryCatch #5 {all -> 0x04fc, blocks: (B:109:0x02ca, B:111:0x02da, B:113:0x02e2, B:119:0x02f0, B:121:0x02f6, B:123:0x02fc, B:125:0x0302, B:126:0x0309, B:127:0x0314, B:128:0x031d, B:130:0x0323, B:132:0x032c, B:269:0x033f), top: B:108:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388 A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0392 A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0398 A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ac A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b6 A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03bc A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2 A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fd A[Catch: all -> 0x04f5, TryCatch #2 {all -> 0x04f5, blocks: (B:143:0x0379, B:145:0x0388, B:146:0x038e, B:148:0x0392, B:150:0x0398, B:151:0x03a6, B:153:0x03ac, B:154:0x03b2, B:156:0x03b6, B:158:0x03bc, B:159:0x03be, B:161:0x03c2, B:163:0x03f2, B:165:0x03fd, B:172:0x0412, B:177:0x0418, B:179:0x0424), top: B:142:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0456 A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04c4 A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ce A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d4 A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04dd A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e7 A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04ed A[Catch: all -> 0x04f3, TRY_LEAVE, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04ae A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0450 A[Catch: all -> 0x04f3, TryCatch #1 {all -> 0x04f3, blocks: (B:182:0x0435, B:183:0x0443, B:184:0x0449, B:188:0x0456, B:191:0x0461, B:194:0x046d, B:197:0x0478, B:200:0x0484, B:205:0x0494, B:207:0x049a, B:208:0x04a0, B:210:0x04a4, B:212:0x04aa, B:215:0x04b0, B:217:0x04c4, B:218:0x04ca, B:220:0x04ce, B:222:0x04d4, B:223:0x04d9, B:225:0x04dd, B:226:0x04e3, B:228:0x04e7, B:230:0x04ed, B:245:0x048b, B:246:0x047f, B:247:0x0474, B:248:0x0468, B:249:0x045d, B:250:0x04ae, B:251:0x0450), top: B:181:0x0435 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x033f A[Catch: all -> 0x04fc, TRY_LEAVE, TryCatch #5 {all -> 0x04fc, blocks: (B:109:0x02ca, B:111:0x02da, B:113:0x02e2, B:119:0x02f0, B:121:0x02f6, B:123:0x02fc, B:125:0x0302, B:126:0x0309, B:127:0x0314, B:128:0x031d, B:130:0x0323, B:132:0x032c, B:269:0x033f), top: B:108:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u84.f0.d(java.lang.Object, boolean):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdBarContainerHelper");
        android.view.ViewGroup viewGroup = this.f425518p;
        a84.y0.c(viewGroup);
        a84.y0.p(viewGroup, false);
        com.tencent.mars.xlog.Log.i("AdBarContainerHelper", "resetUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdBarContainerHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
    }

    public final android.widget.TextView z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        return textView;
    }
}
