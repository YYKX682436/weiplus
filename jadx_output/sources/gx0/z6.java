package gx0;

/* loaded from: classes5.dex */
public final class z6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f277260d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277261e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f277262f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f277263g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f277264h;

    /* renamed from: i, reason: collision with root package name */
    public int f277265i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277267n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.Timeline f277268o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f277269p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f277270q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(java.lang.String str, gx0.w8 w8Var, com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277266m = str;
        this.f277267n = w8Var;
        this.f277268o = timeline;
        this.f277269p = audioCacheInfo;
        this.f277270q = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.z6(this.f277266m, this.f277267n, this.f277268o, this.f277269p, this.f277270q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.z6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0a80, code lost:
    
        if (r4 == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0b32, code lost:
    
        if (r11.size() == 1) goto L415;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037a A[LOOP:0: B:217:0x0374->B:219:0x037a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0bad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06ec A[LOOP:3: B:334:0x06e6->B:336:0x06ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0ac5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0ad4  */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [ex0.c] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 3078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.z6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
