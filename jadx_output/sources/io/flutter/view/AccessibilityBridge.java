package io.flutter.view;

/* loaded from: classes15.dex */
public class AccessibilityBridge extends android.view.accessibility.AccessibilityNodeProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static final float DEFAULT_TRANSITION_ANIMATION_SCALE = 1.0f;
    private static final float DISABLED_TRANSITION_ANIMATION_SCALE = 0.0f;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final java.lang.String TAG = "AccessibilityBridge";
    private final io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;
    private io.flutter.view.AccessibilityBridge.SemanticsNode accessibilityFocusedSemanticsNode;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private final io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final android.database.ContentObserver animationScaleObserver;
    private final android.content.ContentResolver contentResolver;
    private final java.util.Map<java.lang.Integer, io.flutter.view.AccessibilityBridge.CustomAccessibilityAction> customAccessibilityActions;
    private java.lang.Integer embeddedAccessibilityFocusedNodeId;
    private java.lang.Integer embeddedInputFocusedNodeId;
    private final java.util.List<java.lang.Integer> flutterNavigationStack;
    private final java.util.Map<java.lang.Integer, io.flutter.view.AccessibilityBridge.SemanticsNode> flutterSemanticsTree;
    private io.flutter.view.AccessibilityBridge.SemanticsNode hoveredObject;
    private io.flutter.view.AccessibilityBridge.SemanticsNode inputFocusedSemanticsNode;
    private boolean isReleased;
    private io.flutter.view.AccessibilityBridge.SemanticsNode lastInputFocusedSemanticsNode;
    private java.lang.Integer lastLeftFrameInset;
    private io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;
    private final android.view.View rootAccessibilityView;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private static final int SCROLLABLE_ACTIONS = ((io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT.value | io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT.value) | io.flutter.view.AccessibilityBridge.Action.SCROLL_UP.value) | io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN.value;
    private static final int FOCUSABLE_FLAGS = ((((((((((io.flutter.view.AccessibilityBridge.Flag.HAS_CHECKED_STATE.value | io.flutter.view.AccessibilityBridge.Flag.IS_CHECKED.value) | io.flutter.view.AccessibilityBridge.Flag.IS_SELECTED.value) | io.flutter.view.AccessibilityBridge.Flag.IS_TEXT_FIELD.value) | io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSED.value) | io.flutter.view.AccessibilityBridge.Flag.HAS_ENABLED_STATE.value) | io.flutter.view.AccessibilityBridge.Flag.IS_ENABLED.value) | io.flutter.view.AccessibilityBridge.Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | io.flutter.view.AccessibilityBridge.Flag.HAS_TOGGLED_STATE.value) | io.flutter.view.AccessibilityBridge.Flag.IS_TOGGLED.value) | io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSABLE.value) | io.flutter.view.AccessibilityBridge.Flag.IS_SLIDER.value;
    private static int FIRST_RESOURCE_ID = 267386881;
    static int systemAction = (io.flutter.view.AccessibilityBridge.Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & io.flutter.view.AccessibilityBridge.Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & io.flutter.view.AccessibilityBridge.Action.SHOW_ON_SCREEN.value;

    /* renamed from: io.flutter.view.AccessibilityBridge$5, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType;

        static {
            int[] iArr = new int[io.flutter.view.AccessibilityBridge.StringAttributeType.values().length];
            $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType = iArr;
            try {
                iArr[io.flutter.view.AccessibilityBridge.StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[io.flutter.view.AccessibilityBridge.StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[io.flutter.view.AccessibilityBridge.StringAttributeType.URL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128);

        final int value;

        AccessibilityFeature(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes15.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608);

        public final int value;

        Action(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes15.dex */
    public static class CustomAccessibilityAction {
        private java.lang.String hint;
        private java.lang.String label;
        private int resourceId = -1;

        /* renamed from: id, reason: collision with root package name */
        private int f293393id = -1;
        private int overrideId = -1;
    }

    /* loaded from: classes15.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62),
        IS_CHECK_STATE_MIXED(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING),
        IS_REQUIRED(1073741824);

        final int value;

        Flag(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes15.dex */
    public static class LocaleStringAttribute extends io.flutter.view.AccessibilityBridge.StringAttribute {
        java.lang.String locale;

        private LocaleStringAttribute() {
            super();
        }
    }

    /* loaded from: classes15.dex */
    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z17, boolean z18);
    }

    /* loaded from: classes15.dex */
    public static class SemanticsNode {
        final io.flutter.view.AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        private int currentValueLength;
        private java.util.List<io.flutter.view.AccessibilityBridge.CustomAccessibilityAction> customAccessibilityActions;
        private java.lang.String decreasedValue;
        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> decreasedValueAttributes;
        private long flags;
        private android.graphics.Rect globalRect;
        private float[] globalTransform;
        private java.lang.String hint;
        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> hintAttributes;
        private java.lang.String identifier;
        private java.lang.String increasedValue;
        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        private java.lang.String label;
        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> labelAttributes;
        private float left;
        private java.lang.String linkUrl;
        private int maxValueLength;
        private io.flutter.view.AccessibilityBridge.CustomAccessibilityAction onLongPressOverride;
        private io.flutter.view.AccessibilityBridge.CustomAccessibilityAction onTapOverride;
        private io.flutter.view.AccessibilityBridge.SemanticsNode parent;
        private int platformViewId;
        private int previousActions;
        private long previousFlags;
        private java.lang.String previousLabel;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        private int previousTextSelectionBase;
        private int previousTextSelectionExtent;
        private java.lang.String previousValue;
        private float right;
        private int scrollChildren;
        private float scrollExtentMax;
        private float scrollExtentMin;
        private int scrollIndex;
        private float scrollPosition;
        private io.flutter.view.AccessibilityBridge.TextDirection textDirection;
        private int textSelectionBase;
        private int textSelectionExtent;
        private java.lang.String tooltip;
        private float top;
        private float[] transform;
        private java.lang.String value;
        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> valueAttributes;

        /* renamed from: id, reason: collision with root package name */
        private int f293394id = -1;
        private int previousNodeId = -1;
        private boolean hadPreviousConfig = false;
        private java.util.List<io.flutter.view.AccessibilityBridge.SemanticsNode> childrenInTraversalOrder = new java.util.ArrayList();
        private java.util.List<io.flutter.view.AccessibilityBridge.SemanticsNode> childrenInHitTestOrder = new java.util.ArrayList();
        private boolean inverseTransformDirty = true;
        private boolean globalGeometryDirty = true;

        public SemanticsNode(io.flutter.view.AccessibilityBridge accessibilityBridge) {
            this.accessibilityBridge = accessibilityBridge;
        }

        public static /* synthetic */ int access$2212(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, int i17) {
            int i18 = semanticsNode.textSelectionExtent + i17;
            semanticsNode.textSelectionExtent = i18;
            return i18;
        }

        public static /* synthetic */ int access$2220(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, int i17) {
            int i18 = semanticsNode.textSelectionExtent - i17;
            semanticsNode.textSelectionExtent = i18;
            return i18;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void collectRoutes(java.util.List<io.flutter.view.AccessibilityBridge.SemanticsNode> list) {
            if (hasFlag(io.flutter.view.AccessibilityBridge.Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            java.util.Iterator<io.flutter.view.AccessibilityBridge.SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                it.next().collectRoutes(list);
            }
        }

        private android.text.SpannableString createSpannableString(java.lang.String str, java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> list) {
            if (str == null) {
                return null;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            if (list != null) {
                for (io.flutter.view.AccessibilityBridge.StringAttribute stringAttribute : list) {
                    int i17 = io.flutter.view.AccessibilityBridge.AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[stringAttribute.type.ordinal()];
                    if (i17 == 1) {
                        spannableString.setSpan(new android.text.style.TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.start, stringAttribute.end, 0);
                    } else if (i17 == 2) {
                        spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag(((io.flutter.view.AccessibilityBridge.LocaleStringAttribute) stringAttribute).locale)), stringAttribute.start, stringAttribute.end, 0);
                    } else if (i17 == 3) {
                        spannableString.setSpan(new android.text.style.URLSpan(((io.flutter.view.AccessibilityBridge.UrlStringAttribute) stringAttribute).url), stringAttribute.start, stringAttribute.end, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didChangeLabel() {
            java.lang.String str;
            java.lang.String str2 = this.label;
            if (str2 == null && this.previousLabel == null) {
                return false;
            }
            return str2 == null || (str = this.previousLabel) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean didScroll() {
            return (java.lang.Float.isNaN(this.scrollPosition) || java.lang.Float.isNaN(this.previousScrollPosition) || this.previousScrollPosition == this.scrollPosition) ? false : true;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (android.opengl.Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
                    return;
                }
                java.util.Arrays.fill(this.inverseTransform, 0.0f);
            }
        }

        private io.flutter.view.AccessibilityBridge.SemanticsNode getAncestor(io.flutter.util.Predicate<io.flutter.view.AccessibilityBridge.SemanticsNode> predicate) {
            for (io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public android.graphics.Rect getGlobalRect() {
            return this.globalRect;
        }

        private java.lang.CharSequence getHint() {
            return createSpannableString(this.hint, this.hintAttributes);
        }

        private java.lang.CharSequence getLabel() {
            java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> list = this.labelAttributes;
            java.lang.String str = this.linkUrl;
            if (str != null && str.length() > 0) {
                list = list == null ? new java.util.ArrayList<>() : new java.util.ArrayList<>(list);
                io.flutter.view.AccessibilityBridge.UrlStringAttribute urlStringAttribute = new io.flutter.view.AccessibilityBridge.UrlStringAttribute();
                urlStringAttribute.start = 0;
                urlStringAttribute.end = this.label.length();
                urlStringAttribute.url = this.linkUrl;
                urlStringAttribute.type = io.flutter.view.AccessibilityBridge.StringAttributeType.URL;
                list.add(urlStringAttribute);
            }
            return createSpannableString(this.label, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String getRouteName() {
            java.lang.String str;
            if (hasFlag(io.flutter.view.AccessibilityBridge.Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            java.util.Iterator<io.flutter.view.AccessibilityBridge.SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                java.lang.String routeName = it.next().getRouteName();
                if (routeName != null && !routeName.isEmpty()) {
                    return routeName;
                }
            }
            return null;
        }

        private java.util.List<io.flutter.view.AccessibilityBridge.StringAttribute> getStringAttributesFromBuffer(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer[] byteBufferArr) {
            int i17 = byteBuffer.getInt();
            if (i17 == -1) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = byteBuffer.getInt();
                int i27 = byteBuffer.getInt();
                io.flutter.view.AccessibilityBridge.StringAttributeType stringAttributeType = io.flutter.view.AccessibilityBridge.StringAttributeType.values()[byteBuffer.getInt()];
                int i28 = io.flutter.view.AccessibilityBridge.AnonymousClass5.$SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType[stringAttributeType.ordinal()];
                if (i28 == 1) {
                    byteBuffer.getInt();
                    io.flutter.view.AccessibilityBridge.SpellOutStringAttribute spellOutStringAttribute = new io.flutter.view.AccessibilityBridge.SpellOutStringAttribute();
                    spellOutStringAttribute.start = i19;
                    spellOutStringAttribute.end = i27;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i28 == 2) {
                    java.nio.ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    io.flutter.view.AccessibilityBridge.LocaleStringAttribute localeStringAttribute = new io.flutter.view.AccessibilityBridge.LocaleStringAttribute();
                    localeStringAttribute.start = i19;
                    localeStringAttribute.end = i27;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c).decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.CharSequence getTextFieldHint() {
            java.lang.CharSequence[] charSequenceArr = {getLabel(), getHint()};
            java.lang.CharSequence charSequence = null;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.CharSequence charSequence2 = charSequenceArr[i17];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.CharSequence getValue() {
            return createSpannableString(this.value, this.valueAttributes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.CharSequence getValueLabelHint() {
            java.lang.CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
            java.lang.CharSequence charSequence = null;
            for (int i17 = 0; i17 < 3; i17++) {
                java.lang.CharSequence charSequence2 = charSequenceArr[i17];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadAction(io.flutter.view.AccessibilityBridge.Action action) {
            return (action.value & this.previousActions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hadFlag(io.flutter.view.AccessibilityBridge.Flag flag) {
            return (this.previousFlags & ((long) flag.value)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasAction(io.flutter.view.AccessibilityBridge.Action action) {
            return (action.value & this.actions) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasFlag(io.flutter.view.AccessibilityBridge.Flag flag) {
            return (this.flags & ((long) flag.value)) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.flutter.view.AccessibilityBridge.SemanticsNode hitTest(float[] fArr, boolean z17) {
            float f17 = fArr[3];
            boolean z18 = false;
            float f18 = fArr[0] / f17;
            float f19 = fArr[1] / f17;
            if (f18 < this.left || f18 >= this.right || f19 < this.top || f19 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
                if (!semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN)) {
                    semanticsNode.ensureInverseTransform();
                    android.opengl.Matrix.multiplyMV(fArr2, 0, semanticsNode.inverseTransform, 0, fArr, 0);
                    io.flutter.view.AccessibilityBridge.SemanticsNode hitTest = semanticsNode.hitTest(fArr2, z17);
                    if (hitTest != null) {
                        return hitTest;
                    }
                }
            }
            if (z17 && this.platformViewId != -1) {
                z18 = true;
            }
            if (isFocusable() || z18) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isFocusable() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            if (hasFlag(io.flutter.view.AccessibilityBridge.Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.actions & (~io.flutter.view.AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & ((long) io.flutter.view.AccessibilityBridge.FOCUSABLE_FLAGS)) == 0 && ((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty()))) ? false : true;
        }

        private void log(java.lang.String str, boolean z17) {
        }

        private float max(float f17, float f18, float f19, float f27) {
            return java.lang.Math.max(f17, java.lang.Math.max(f18, java.lang.Math.max(f19, f27)));
        }

        private float min(float f17, float f18, float f19, float f27) {
            return java.lang.Math.min(f17, java.lang.Math.min(f18, java.lang.Math.min(f19, f27)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean nullableHasAncestor(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, io.flutter.util.Predicate<io.flutter.view.AccessibilityBridge.SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            android.opengl.Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f17 = fArr[3];
            fArr[0] = fArr[0] / f17;
            fArr[1] = fArr[1] / f17;
            fArr[2] = fArr[2] / f17;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateRecursively(float[] fArr, java.util.Set<io.flutter.view.AccessibilityBridge.SemanticsNode> set, boolean z17) {
            if (this.transform == null) {
                return;
            }
            set.add(this);
            if (this.globalGeometryDirty) {
                z17 = true;
            }
            if (z17) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                if (this.transform == null) {
                    this.transform = new float[16];
                }
                android.opengl.Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                float[] fArr2 = {this.left, this.top, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                transformPoint(fArr3, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.top;
                transformPoint(fArr4, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.bottom;
                transformPoint(fArr5, this.globalTransform, fArr2);
                fArr2[0] = this.left;
                fArr2[1] = this.bottom;
                transformPoint(fArr6, this.globalTransform, fArr2);
                if (this.globalRect == null) {
                    this.globalRect = new android.graphics.Rect();
                }
                this.globalRect.set(java.lang.Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), java.lang.Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), java.lang.Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), java.lang.Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.globalGeometryDirty = false;
            }
            int i17 = -1;
            for (io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode : this.childrenInTraversalOrder) {
                semanticsNode.previousNodeId = i17;
                i17 = semanticsNode.f293394id;
                semanticsNode.updateRecursively(this.globalTransform, set, z17);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateWith(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getLong();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int i17 = byteBuffer.getInt();
            this.identifier = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            this.label = i18 == -1 ? null : strArr[i18];
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i19 = byteBuffer.getInt();
            this.value = i19 == -1 ? null : strArr[i19];
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i27 = byteBuffer.getInt();
            this.increasedValue = i27 == -1 ? null : strArr[i27];
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i28 = byteBuffer.getInt();
            this.decreasedValue = i28 == -1 ? null : strArr[i28];
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i29 = byteBuffer.getInt();
            this.hint = i29 == -1 ? null : strArr[i29];
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i37 = byteBuffer.getInt();
            this.tooltip = i37 == -1 ? null : strArr[i37];
            int i38 = byteBuffer.getInt();
            this.linkUrl = i38 == -1 ? null : strArr[i38];
            this.textDirection = io.flutter.view.AccessibilityBridge.TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            for (int i39 = 0; i39 < 16; i39++) {
                this.transform[i39] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i47 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i48 = 0; i48 < i47; i48++) {
                io.flutter.view.AccessibilityBridge.SemanticsNode orCreateSemanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode.parent = this;
                this.childrenInTraversalOrder.add(orCreateSemanticsNode);
            }
            for (int i49 = 0; i49 < i47; i49++) {
                io.flutter.view.AccessibilityBridge.SemanticsNode orCreateSemanticsNode2 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode2.parent = this;
                this.childrenInHitTestOrder.add(orCreateSemanticsNode2);
            }
            int i57 = byteBuffer.getInt();
            if (i57 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            java.util.List<io.flutter.view.AccessibilityBridge.CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new java.util.ArrayList(i57);
            } else {
                list.clear();
            }
            for (int i58 = 0; i58 < i57; i58++) {
                io.flutter.view.AccessibilityBridge.CustomAccessibilityAction orCreateAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (orCreateAccessibilityAction.overrideId == io.flutter.view.AccessibilityBridge.Action.TAP.value) {
                    this.onTapOverride = orCreateAccessibilityAction;
                } else if (orCreateAccessibilityAction.overrideId == io.flutter.view.AccessibilityBridge.Action.LONG_PRESS.value) {
                    this.onLongPressOverride = orCreateAccessibilityAction;
                } else {
                    this.customAccessibilityActions.add(orCreateAccessibilityAction);
                }
                this.customAccessibilityActions.add(orCreateAccessibilityAction);
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class SpellOutStringAttribute extends io.flutter.view.AccessibilityBridge.StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }
    }

    /* loaded from: classes15.dex */
    public static class StringAttribute {
        int end;
        int start;
        io.flutter.view.AccessibilityBridge.StringAttributeType type;

        private StringAttribute() {
        }
    }

    /* loaded from: classes15.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE,
        URL
    }

    /* loaded from: classes6.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static io.flutter.view.AccessibilityBridge.TextDirection fromInt(int i17) {
            return i17 != 1 ? i17 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    /* loaded from: classes15.dex */
    public static class UrlStringAttribute extends io.flutter.view.AccessibilityBridge.StringAttribute {
        java.lang.String url;

        private UrlStringAttribute() {
            super();
        }
    }

    public AccessibilityBridge(android.view.View view, io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel, android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this(view, accessibilityChannel, accessibilityManager, contentResolver, new io.flutter.view.AccessibilityViewEmbedder(view, 65536), platformViewsAccessibilityDelegate);
    }

    public static /* synthetic */ int access$1172(io.flutter.view.AccessibilityBridge accessibilityBridge, int i17) {
        int i18 = i17 & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i18;
        return i18;
    }

    public static /* synthetic */ int access$1176(io.flutter.view.AccessibilityBridge accessibilityBridge, int i17) {
        int i18 = i17 | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i18;
        return i18;
    }

    private android.view.accessibility.AccessibilityEvent createTextChangedEvent(int i17, java.lang.String str, java.lang.String str2) {
        android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i17, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i18 = 0;
        while (i18 < str.length() && i18 < str2.length() && str.charAt(i18) == str2.charAt(i18)) {
            i18++;
        }
        if (i18 >= str.length() && i18 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i18);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i18 && length2 >= i18 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i18) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i18) + 1);
        return obtainAccessibilityEvent;
    }

    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        android.app.Activity activity = io.flutter.util.ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        int i17 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i17 == 2 || i17 == 0;
    }

    private android.graphics.Rect getBoundsInScreen(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.view.AccessibilityBridge.CustomAccessibilityAction getOrCreateAccessibilityAction(int i17) {
        io.flutter.view.AccessibilityBridge.CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(java.lang.Integer.valueOf(i17));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        io.flutter.view.AccessibilityBridge.CustomAccessibilityAction customAccessibilityAction2 = new io.flutter.view.AccessibilityBridge.CustomAccessibilityAction();
        customAccessibilityAction2.f293393id = i17;
        customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i17;
        this.customAccessibilityActions.put(java.lang.Integer.valueOf(i17), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.view.AccessibilityBridge.SemanticsNode getOrCreateSemanticsNode(int i17) {
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.flutterSemanticsTree.get(java.lang.Integer.valueOf(i17));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2 = new io.flutter.view.AccessibilityBridge.SemanticsNode(this);
        semanticsNode2.f293394id = i17;
        this.flutterSemanticsTree.put(java.lang.Integer.valueOf(i17), semanticsNode2);
        return semanticsNode2;
    }

    private io.flutter.view.AccessibilityBridge.SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f17, float f18, boolean z17) {
        io.flutter.view.AccessibilityBridge.SemanticsNode hitTest;
        if (this.flutterSemanticsTree.isEmpty() || (hitTest = getRootSemanticsNode().hitTest(new float[]{f17, f18, 0.0f, 1.0f}, z17)) == this.hoveredObject) {
            return;
        }
        if (hitTest != null) {
            sendAccessibilityEvent(hitTest.f293394id, 128);
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f293394id, 256);
        }
        this.hoveredObject = hitTest;
    }

    private boolean isImportant(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode) {
        if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (semanticsNode.getValueLabelHint() == null && (semanticsNode.actions & (~systemAction)) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode) {
        return semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent(int i17, int i18) {
        android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i18);
        obtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityEvent.setSource(this.rootAccessibilityView, i17);
        return obtainAccessibilityEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchExplorationExit() {
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f293394id, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode) {
        java.lang.String routeName = semanticsNode.getRouteName();
        if (routeName == null) {
            routeName = " ";
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(routeName);
            return;
        }
        android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f293394id, 32);
        obtainAccessibilityEvent.getText().add(routeName);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private boolean performCursorMoveAction(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, int i17, android.os.Bundle bundle, boolean z17) {
        int i18 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z18 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i19 = semanticsNode.textSelectionBase;
        int i27 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i18, z17, z18);
        if (i19 != semanticsNode.textSelectionBase || i27 != semanticsNode.textSelectionExtent) {
            java.lang.String str = semanticsNode.value != null ? semanticsNode.value : "";
            android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f293394id, 8192);
            obtainAccessibilityEvent.getText().add(str);
            obtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            obtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            obtainAccessibilityEvent.setItemCount(str.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i18 == 1) {
            if (z17) {
                io.flutter.view.AccessibilityBridge.Action action = io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i17, action, java.lang.Boolean.valueOf(z18));
                    return true;
                }
            }
            if (z17) {
                return false;
            }
            io.flutter.view.AccessibilityBridge.Action action2 = io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i17, action2, java.lang.Boolean.valueOf(z18));
            return true;
        }
        if (i18 != 2) {
            return i18 == 4 || i18 == 8 || i18 == 16;
        }
        if (z17) {
            io.flutter.view.AccessibilityBridge.Action action3 = io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (semanticsNode.hasAction(action3)) {
                this.accessibilityChannel.dispatchSemanticsAction(i17, action3, java.lang.Boolean.valueOf(z18));
                return true;
            }
        }
        if (z17) {
            return false;
        }
        io.flutter.view.AccessibilityBridge.Action action4 = io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!semanticsNode.hasAction(action4)) {
            return false;
        }
        this.accessibilityChannel.dispatchSemanticsAction(i17, action4, java.lang.Boolean.valueOf(z18));
        return true;
    }

    private boolean performSetText(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, int i17, android.os.Bundle bundle) {
        java.lang.String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.SET_TEXT, string);
        semanticsNode.value = string;
        semanticsNode.valueAttributes = null;
        return true;
    }

    private void predictCursorMovement(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode, int i17, boolean z17, boolean z18) {
        if (semanticsNode.textSelectionExtent < 0 || semanticsNode.textSelectionBase < 0) {
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 4) {
                    if (i17 == 8 || i17 == 16) {
                        if (z17) {
                            semanticsNode.textSelectionExtent = semanticsNode.value.length();
                        } else {
                            semanticsNode.textSelectionExtent = 0;
                        }
                    }
                } else if (z17 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?!^)(\\n)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                    if (matcher.find()) {
                        io.flutter.view.AccessibilityBridge.SemanticsNode.access$2212(semanticsNode, matcher.start(1));
                    } else {
                        semanticsNode.textSelectionExtent = semanticsNode.value.length();
                    }
                } else if (!z17 && semanticsNode.textSelectionExtent > 0) {
                    java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(?s:.*)(\\n)").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                    if (matcher2.find()) {
                        semanticsNode.textSelectionExtent = matcher2.start(1);
                    } else {
                        semanticsNode.textSelectionExtent = 0;
                    }
                }
            } else if (z17 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
                java.util.regex.Matcher matcher3 = java.util.regex.Pattern.compile("\\p{L}(\\b)").matcher(semanticsNode.value.substring(semanticsNode.textSelectionExtent));
                matcher3.find();
                if (matcher3.find()) {
                    io.flutter.view.AccessibilityBridge.SemanticsNode.access$2212(semanticsNode, matcher3.start(1));
                } else {
                    semanticsNode.textSelectionExtent = semanticsNode.value.length();
                }
            } else if (!z17 && semanticsNode.textSelectionExtent > 0) {
                java.util.regex.Matcher matcher4 = java.util.regex.Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(semanticsNode.value.substring(0, semanticsNode.textSelectionExtent));
                if (matcher4.find()) {
                    semanticsNode.textSelectionExtent = matcher4.start(1);
                }
            }
        } else if (z17 && semanticsNode.textSelectionExtent < semanticsNode.value.length()) {
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2212(semanticsNode, 1);
        } else if (!z17 && semanticsNode.textSelectionExtent > 0) {
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2220(semanticsNode, 1);
        }
        if (z18) {
            return;
        }
        semanticsNode.textSelectionBase = semanticsNode.textSelectionExtent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i17) {
        android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i17, 2048);
        obtainAccessibilityEvent.setContentChangeTypes(1);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    private void setAccessibilityPaneTitle(java.lang.String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibleNavigation(boolean z17) {
        if (this.accessibleNavigation == z17) {
            return;
        }
        this.accessibleNavigation = z17;
        if (z17) {
            this.accessibilityFeatureFlags |= io.flutter.view.AccessibilityBridge.AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.accessibilityFeatureFlags &= ~io.flutter.view.AccessibilityBridge.AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private void setBoldTextFlag() {
        android.view.View view = this.rootAccessibilityView;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i17 = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
        if (i17 != Integer.MAX_VALUE && i17 >= 300) {
            this.accessibilityFeatureFlags |= io.flutter.view.AccessibilityBridge.AccessibilityFeature.BOLD_TEXT.value;
        } else {
            this.accessibilityFeatureFlags &= ~io.flutter.view.AccessibilityBridge.AccessibilityFeature.BOLD_TEXT.value;
        }
        sendLatestAccessibilityFlagsToFlutter();
    }

    private boolean shouldSetCollectionInfo(final io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (io.flutter.view.AccessibilityBridge.SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new io.flutter.util.Predicate() { // from class: io.flutter.view.AccessibilityBridge$$a
            @Override // io.flutter.util.Predicate
            public final boolean test(java.lang.Object obj) {
                boolean lambda$shouldSetCollectionInfo$0;
                lambda$shouldSetCollectionInfo$0 = io.flutter.view.AccessibilityBridge.lambda$shouldSetCollectionInfo$0(io.flutter.view.AccessibilityBridge.SemanticsNode.this, (io.flutter.view.AccessibilityBridge.SemanticsNode) obj);
                return lambda$shouldSetCollectionInfo$0;
            }
        }) || !io.flutter.view.AccessibilityBridge.SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new io.flutter.view.AccessibilityBridge$$b()));
    }

    private void willRemoveSemanticsNode(io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode) {
        android.view.View platformViewById;
        java.lang.Integer num;
        semanticsNode.parent = null;
        if (semanticsNode.platformViewId != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), 65536);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (semanticsNode.platformViewId != -1 && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) != null) {
            platformViewById.setImportantForAccessibility(4);
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.f293394id, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        int i18;
        boolean z17 = true;
        setAccessibleNavigation(true);
        if (i17 >= 65536) {
            return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(i17);
        }
        if (i17 == -1) {
            android.view.accessibility.AccessibilityNodeInfo obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(this.rootAccessibilityView);
            this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(obtainAccessibilityNodeInfo);
            if (this.flutterSemanticsTree.containsKey(0)) {
                obtainAccessibilityNodeInfo.addChild(this.rootAccessibilityView, 0);
            }
            obtainAccessibilityNodeInfo.setImportantForAccessibility(false);
            return obtainAccessibilityNodeInfo;
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.flutterSemanticsTree.get(java.lang.Integer.valueOf(i17));
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.platformViewId != -1 && this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode.platformViewId)) {
            android.view.View platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId);
            if (platformViewById == null) {
                return null;
            }
            return this.accessibilityViewEmbedder.getRootNode(platformViewById, semanticsNode.f293394id, semanticsNode.getGlobalRect());
        }
        android.view.accessibility.AccessibilityNodeInfo obtainAccessibilityNodeInfo2 = obtainAccessibilityNodeInfo(this.rootAccessibilityView, i17);
        int i19 = android.os.Build.VERSION.SDK_INT;
        obtainAccessibilityNodeInfo2.setImportantForAccessibility(isImportant(semanticsNode));
        obtainAccessibilityNodeInfo2.setViewIdResourceName("");
        if (semanticsNode.identifier != null) {
            obtainAccessibilityNodeInfo2.setViewIdResourceName(semanticsNode.identifier);
        }
        obtainAccessibilityNodeInfo2.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityNodeInfo2.setClassName("android.view.View");
        obtainAccessibilityNodeInfo2.setSource(this.rootAccessibilityView, i17);
        obtainAccessibilityNodeInfo2.setFocusable(semanticsNode.isFocusable());
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2 = this.inputFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            obtainAccessibilityNodeInfo2.setFocused(semanticsNode2.f293394id == i17);
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode3 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode3 != null) {
            obtainAccessibilityNodeInfo2.setAccessibilityFocused(semanticsNode3.f293394id == i17);
        }
        io.flutter.view.AccessibilityBridge.Flag flag = io.flutter.view.AccessibilityBridge.Flag.IS_TEXT_FIELD;
        if (semanticsNode.hasFlag(flag)) {
            obtainAccessibilityNodeInfo2.setPassword(semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_OBSCURED));
            if (!semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_READ_ONLY)) {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.EditText");
            }
            obtainAccessibilityNodeInfo2.setEditable(!semanticsNode.hasFlag(r9));
            if (semanticsNode.textSelectionBase != -1 && semanticsNode.textSelectionExtent != -1) {
                obtainAccessibilityNodeInfo2.setTextSelection(semanticsNode.textSelectionBase, semanticsNode.textSelectionExtent);
            }
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode4 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode4 != null && semanticsNode4.f293394id == i17) {
                obtainAccessibilityNodeInfo2.setLiveRegion(1);
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo2.addAction(256);
                i18 = 1;
            } else {
                i18 = 0;
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtainAccessibilityNodeInfo2.addAction(512);
                i18 |= 1;
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo2.addAction(256);
                i18 |= 2;
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtainAccessibilityNodeInfo2.addAction(512);
                i18 |= 2;
            }
            obtainAccessibilityNodeInfo2.setMovementGranularities(i18);
            if (semanticsNode.maxValueLength >= 0) {
                int length = semanticsNode.value == null ? 0 : semanticsNode.value.length();
                int unused = semanticsNode.currentValueLength;
                int unused2 = semanticsNode.maxValueLength;
                obtainAccessibilityNodeInfo2.setMaxTextLength((length - semanticsNode.currentValueLength) + semanticsNode.maxValueLength);
            }
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SET_SELECTION)) {
            obtainAccessibilityNodeInfo2.addAction(131072);
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.COPY)) {
            obtainAccessibilityNodeInfo2.addAction(16384);
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.CUT)) {
            obtainAccessibilityNodeInfo2.addAction(65536);
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.PASTE)) {
            obtainAccessibilityNodeInfo2.addAction(32768);
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SET_TEXT)) {
            obtainAccessibilityNodeInfo2.addAction(2097152);
        }
        if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_BUTTON)) {
            obtainAccessibilityNodeInfo2.setClassName(com.tencent.mm.accessibility.core.provider.TypeModifier.BUTTON_CLASS);
        }
        if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_IMAGE)) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.ImageView");
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.DISMISS)) {
            obtainAccessibilityNodeInfo2.setDismissable(true);
            obtainAccessibilityNodeInfo2.addAction(1048576);
        }
        if (semanticsNode.parent != null) {
            obtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView, semanticsNode.parent.f293394id);
        } else {
            obtainAccessibilityNodeInfo2.setParent(this.rootAccessibilityView);
        }
        if (semanticsNode.previousNodeId != -1) {
            obtainAccessibilityNodeInfo2.setTraversalAfter(this.rootAccessibilityView, semanticsNode.previousNodeId);
        }
        android.graphics.Rect globalRect = semanticsNode.getGlobalRect();
        if (semanticsNode.parent != null) {
            android.graphics.Rect globalRect2 = semanticsNode.parent.getGlobalRect();
            android.graphics.Rect rect = new android.graphics.Rect(globalRect);
            rect.offset(-globalRect2.left, -globalRect2.top);
            obtainAccessibilityNodeInfo2.setBoundsInParent(rect);
        } else {
            obtainAccessibilityNodeInfo2.setBoundsInParent(globalRect);
        }
        obtainAccessibilityNodeInfo2.setBoundsInScreen(getBoundsInScreen(globalRect));
        obtainAccessibilityNodeInfo2.setVisibleToUser(true);
        obtainAccessibilityNodeInfo2.setEnabled(!semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.HAS_ENABLED_STATE) || semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_ENABLED));
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.TAP)) {
            if (semanticsNode.onTapOverride != null) {
                obtainAccessibilityNodeInfo2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, semanticsNode.onTapOverride.hint));
                obtainAccessibilityNodeInfo2.setClickable(true);
            } else {
                obtainAccessibilityNodeInfo2.addAction(16);
                obtainAccessibilityNodeInfo2.setClickable(true);
            }
        } else if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_SLIDER)) {
            obtainAccessibilityNodeInfo2.addAction(16);
            obtainAccessibilityNodeInfo2.setClickable(true);
        }
        if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.LONG_PRESS)) {
            if (semanticsNode.onLongPressOverride != null) {
                obtainAccessibilityNodeInfo2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, semanticsNode.onLongPressOverride.hint));
                obtainAccessibilityNodeInfo2.setLongClickable(true);
            } else {
                obtainAccessibilityNodeInfo2.addAction(32);
                obtainAccessibilityNodeInfo2.setLongClickable(true);
            }
        }
        io.flutter.view.AccessibilityBridge.Action action = io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT;
        if (semanticsNode.hasAction(action) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_UP) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN)) {
            obtainAccessibilityNodeInfo2.setScrollable(true);
            if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING)) {
                if (semanticsNode.hasAction(action) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT)) {
                    if (shouldSetCollectionInfo(semanticsNode)) {
                        obtainAccessibilityNodeInfo2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(0, semanticsNode.scrollChildren, false));
                    } else {
                        obtainAccessibilityNodeInfo2.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (shouldSetCollectionInfo(semanticsNode)) {
                    obtainAccessibilityNodeInfo2.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(semanticsNode.scrollChildren, 0, false));
                } else {
                    obtainAccessibilityNodeInfo2.setClassName("android.widget.ScrollView");
                }
            }
            if (semanticsNode.hasAction(action) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_UP)) {
                obtainAccessibilityNodeInfo2.addAction(4096);
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN)) {
                obtainAccessibilityNodeInfo2.addAction(8192);
            }
        }
        io.flutter.view.AccessibilityBridge.Action action2 = io.flutter.view.AccessibilityBridge.Action.INCREASE;
        if (semanticsNode.hasAction(action2) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.DECREASE)) {
            obtainAccessibilityNodeInfo2.setClassName("android.widget.SeekBar");
            if (semanticsNode.hasAction(action2)) {
                obtainAccessibilityNodeInfo2.addAction(4096);
            }
            if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.DECREASE)) {
                obtainAccessibilityNodeInfo2.addAction(8192);
            }
        }
        if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_LIVE_REGION)) {
            obtainAccessibilityNodeInfo2.setLiveRegion(1);
        }
        if (semanticsNode.hasFlag(flag)) {
            obtainAccessibilityNodeInfo2.setText(semanticsNode.getValue());
            if (i19 >= 28) {
                obtainAccessibilityNodeInfo2.setHintText(semanticsNode.getTextFieldHint());
            }
        } else if (!semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.SCOPES_ROUTE)) {
            java.lang.CharSequence valueLabelHint = semanticsNode.getValueLabelHint();
            if (i19 < 28 && semanticsNode.tooltip != null) {
                valueLabelHint = ((java.lang.Object) (valueLabelHint != null ? valueLabelHint : "")) + "\n" + semanticsNode.tooltip;
            }
            if (valueLabelHint != null) {
                obtainAccessibilityNodeInfo2.setContentDescription(valueLabelHint);
            }
        }
        if (i19 >= 28 && semanticsNode.tooltip != null) {
            obtainAccessibilityNodeInfo2.setTooltipText(semanticsNode.tooltip);
            if (semanticsNode.getValueLabelHint() == null) {
                obtainAccessibilityNodeInfo2.setContentDescription(semanticsNode.tooltip);
            }
        }
        boolean hasFlag = semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.HAS_CHECKED_STATE);
        boolean hasFlag2 = semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.HAS_TOGGLED_STATE);
        if (!hasFlag && !hasFlag2) {
            z17 = false;
        }
        obtainAccessibilityNodeInfo2.setCheckable(z17);
        if (hasFlag) {
            obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_CHECKED));
            if (semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.RadioButton");
            } else {
                obtainAccessibilityNodeInfo2.setClassName("android.widget.CheckBox");
            }
        } else if (hasFlag2) {
            obtainAccessibilityNodeInfo2.setChecked(semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_TOGGLED));
            obtainAccessibilityNodeInfo2.setClassName("android.widget.Switch");
        }
        obtainAccessibilityNodeInfo2.setSelected(semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_SELECTED));
        if (i19 >= 28) {
            obtainAccessibilityNodeInfo2.setHeading(semanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_HEADER));
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode5 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode5 == null || semanticsNode5.f293394id != i17) {
            obtainAccessibilityNodeInfo2.addAction(64);
        } else {
            obtainAccessibilityNodeInfo2.addAction(128);
        }
        if (semanticsNode.customAccessibilityActions != null) {
            for (io.flutter.view.AccessibilityBridge.CustomAccessibilityAction customAccessibilityAction : semanticsNode.customAccessibilityActions) {
                obtainAccessibilityNodeInfo2.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(customAccessibilityAction.resourceId, customAccessibilityAction.label));
            }
        }
        for (io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode6 : semanticsNode.childrenInTraversalOrder) {
            if (!semanticsNode6.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN)) {
                if (semanticsNode6.platformViewId != -1) {
                    android.view.View platformViewById2 = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode6.platformViewId);
                    if (!this.platformViewsAccessibilityDelegate.usesVirtualDisplay(semanticsNode6.platformViewId)) {
                        platformViewById2.setImportantForAccessibility(0);
                        obtainAccessibilityNodeInfo2.addChild(platformViewById2);
                    }
                }
                obtainAccessibilityNodeInfo2.addChild(this.rootAccessibilityView, semanticsNode6.f293394id);
            }
        }
        return obtainAccessibilityNodeInfo2;
    }

    public boolean externalViewRequestSendAccessibilityEvent(android.view.View view, android.view.View view2, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        java.lang.Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        }
        if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        }
        if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.embeddedInputFocusedNodeId = null;
        this.embeddedAccessibilityFocusedNodeId = null;
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int i17) {
        if (i17 == 1) {
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.inputFocusedSemanticsNode;
            if (semanticsNode != null) {
                return createAccessibilityNodeInfo(semanticsNode.f293394id);
            }
            java.lang.Integer num = this.embeddedInputFocusedNodeId;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i17 != 2) {
            return null;
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 != null) {
            return createAccessibilityNodeInfo(semanticsNode2.f293394id);
        }
        java.lang.Integer num2 = this.embeddedAccessibilityFocusedNodeId;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.f293394id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public android.view.accessibility.AccessibilityNodeInfo obtainAccessibilityNodeInfo(android.view.View view) {
        return android.view.accessibility.AccessibilityNodeInfo.obtain(view);
    }

    public boolean onAccessibilityHoverEvent(android.view.MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        if (i17 >= 65536) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i17, i18, bundle);
            if (performAction && i18 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.flutterSemanticsTree.get(java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i18) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.TAP);
                return true;
            case 32:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.LONG_PRESS);
                return true;
            case 64:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", java.lang.Integer.valueOf(semanticsNode.f293394id));
                this.accessibilityChannel.channel.send(hashMap);
                sendAccessibilityEvent(i17, 32768);
                if (semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.INCREASE) || semanticsNode.hasAction(io.flutter.view.AccessibilityBridge.Action.DECREASE)) {
                    sendAccessibilityEvent(i17, 4);
                }
                return true;
            case 128:
                io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.f293394id == i17) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                java.lang.Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i17) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i17, 65536);
                return true;
            case 256:
                return performCursorMoveAction(semanticsNode, i17, bundle, true);
            case 512:
                return performCursorMoveAction(semanticsNode, i17, bundle, false);
            case 4096:
                io.flutter.view.AccessibilityBridge.Action action = io.flutter.view.AccessibilityBridge.Action.SCROLL_UP;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i17, action);
                } else {
                    io.flutter.view.AccessibilityBridge.Action action2 = io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT;
                    if (semanticsNode.hasAction(action2)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i17, action2);
                    } else {
                        io.flutter.view.AccessibilityBridge.Action action3 = io.flutter.view.AccessibilityBridge.Action.INCREASE;
                        if (!semanticsNode.hasAction(action3)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.increasedValue;
                        semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i17, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i17, action3);
                    }
                }
                return true;
            case 8192:
                io.flutter.view.AccessibilityBridge.Action action4 = io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN;
                if (semanticsNode.hasAction(action4)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i17, action4);
                } else {
                    io.flutter.view.AccessibilityBridge.Action action5 = io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT;
                    if (semanticsNode.hasAction(action5)) {
                        this.accessibilityChannel.dispatchSemanticsAction(i17, action5);
                    } else {
                        io.flutter.view.AccessibilityBridge.Action action6 = io.flutter.view.AccessibilityBridge.Action.DECREASE;
                        if (!semanticsNode.hasAction(action6)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.decreasedValue;
                        semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i17, 4);
                        this.accessibilityChannel.dispatchSemanticsAction(i17, action6);
                    }
                }
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.PASTE);
                return true;
            case 65536:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.CUT);
                return true;
            case 131072:
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z17 = true;
                }
                if (z17) {
                    hashMap2.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", java.lang.Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, java.lang.Integer.valueOf(semanticsNode.textSelectionExtent));
                    hashMap2.put("extent", java.lang.Integer.valueOf(semanticsNode.textSelectionExtent));
                }
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.SET_SELECTION, hashMap2);
                io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(java.lang.Integer.valueOf(i17));
                semanticsNode3.textSelectionBase = ((java.lang.Integer) hashMap2.get(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE)).intValue();
                semanticsNode3.textSelectionExtent = ((java.lang.Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.DISMISS);
                return true;
            case 2097152:
                return performSetText(semanticsNode, i17, bundle);
            case 16908342:
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.SHOW_ON_SCREEN);
                return true;
            default:
                io.flutter.view.AccessibilityBridge.CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(java.lang.Integer.valueOf(i18 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i17, io.flutter.view.AccessibilityBridge.Action.CUSTOM_ACTION, java.lang.Integer.valueOf(customAccessibilityAction.f293393id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler(null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f293394id, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    public void sendAccessibilityEvent(int i17, int i18) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i17, i18));
        }
    }

    public void setOnAccessibilityChangeListener(io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener;
    }

    public void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            io.flutter.view.AccessibilityBridge.CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            int i17 = byteBuffer.getInt();
            java.lang.String str = null;
            orCreateAccessibilityAction.label = i17 == -1 ? null : strArr[i17];
            int i18 = byteBuffer.getInt();
            if (i18 != -1) {
                str = strArr[i18];
            }
            orCreateAccessibilityAction.hint = str;
        }
    }

    public void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode;
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode2;
        float f17;
        float f18;
        android.view.View platformViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (byteBuffer.hasRemaining()) {
            io.flutter.view.AccessibilityBridge.SemanticsNode orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
            orCreateSemanticsNode.updateWith(byteBuffer, strArr, byteBufferArr);
            if (!orCreateSemanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN)) {
                if (orCreateSemanticsNode.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_FOCUSED)) {
                    this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                }
                if (orCreateSemanticsNode.hadPreviousConfig) {
                    arrayList.add(orCreateSemanticsNode);
                }
                if (orCreateSemanticsNode.platformViewId != -1 && !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(orCreateSemanticsNode.platformViewId) && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(orCreateSemanticsNode.platformViewId)) != null) {
                    platformViewById.setImportantForAccessibility(0);
                }
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        io.flutter.view.AccessibilityBridge.SemanticsNode rootSemanticsNode = getRootSemanticsNode();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (rootSemanticsNode != null) {
            float[] fArr = new float[16];
            android.opengl.Matrix.setIdentityM(fArr, 0);
            rootSemanticsNode.updateRecursively(fArr, hashSet, false);
            rootSemanticsNode.collectRoutes(arrayList2);
        }
        java.util.Iterator it = arrayList2.iterator();
        io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode3 = null;
        while (it.hasNext()) {
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode4 = (io.flutter.view.AccessibilityBridge.SemanticsNode) it.next();
            if (!this.flutterNavigationStack.contains(java.lang.Integer.valueOf(semanticsNode4.f293394id))) {
                semanticsNode3 = semanticsNode4;
            }
        }
        if (semanticsNode3 == null && arrayList2.size() > 0) {
            semanticsNode3 = (io.flutter.view.AccessibilityBridge.SemanticsNode) arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode3 != null && (semanticsNode3.f293394id != this.previousRouteId || arrayList2.size() != this.flutterNavigationStack.size())) {
            this.previousRouteId = semanticsNode3.f293394id;
            onWindowNameChange(semanticsNode3);
        }
        this.flutterNavigationStack.clear();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            this.flutterNavigationStack.add(java.lang.Integer.valueOf(((io.flutter.view.AccessibilityBridge.SemanticsNode) it6.next()).f293394id));
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, io.flutter.view.AccessibilityBridge.SemanticsNode>> it7 = this.flutterSemanticsTree.entrySet().iterator();
        while (it7.hasNext()) {
            io.flutter.view.AccessibilityBridge.SemanticsNode value = it7.next().getValue();
            if (!hashSet.contains(value)) {
                willRemoveSemanticsNode(value);
                it7.remove();
            }
        }
        sendWindowContentChangeEvent(0);
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode5 = (io.flutter.view.AccessibilityBridge.SemanticsNode) it8.next();
            if (semanticsNode5.didScroll()) {
                android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode5.f293394id, 4096);
                float f19 = semanticsNode5.scrollPosition;
                float f27 = semanticsNode5.scrollExtentMax;
                if (java.lang.Float.isInfinite(semanticsNode5.scrollExtentMax)) {
                    if (f19 > SCROLL_POSITION_CAP_FOR_INFINITY) {
                        f19 = 70000.0f;
                    }
                    f27 = 100000.0f;
                }
                if (java.lang.Float.isInfinite(semanticsNode5.scrollExtentMin)) {
                    f17 = f27 + SCROLL_EXTENT_FOR_INFINITY;
                    if (f19 < -70000.0f) {
                        f19 = -70000.0f;
                    }
                    f18 = f19 + SCROLL_EXTENT_FOR_INFINITY;
                } else {
                    f17 = f27 - semanticsNode5.scrollExtentMin;
                    f18 = f19 - semanticsNode5.scrollExtentMin;
                }
                if (semanticsNode5.hadAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_UP) || semanticsNode5.hadAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_DOWN)) {
                    obtainAccessibilityEvent.setScrollY((int) f18);
                    obtainAccessibilityEvent.setMaxScrollY((int) f17);
                } else if (semanticsNode5.hadAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_LEFT) || semanticsNode5.hadAction(io.flutter.view.AccessibilityBridge.Action.SCROLL_RIGHT)) {
                    obtainAccessibilityEvent.setScrollX((int) f18);
                    obtainAccessibilityEvent.setMaxScrollX((int) f17);
                }
                if (semanticsNode5.scrollChildren > 0) {
                    obtainAccessibilityEvent.setItemCount(semanticsNode5.scrollChildren);
                    obtainAccessibilityEvent.setFromIndex(semanticsNode5.scrollIndex);
                    java.util.Iterator it9 = semanticsNode5.childrenInHitTestOrder.iterator();
                    int i17 = 0;
                    while (it9.hasNext()) {
                        if (!((io.flutter.view.AccessibilityBridge.SemanticsNode) it9.next()).hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_HIDDEN)) {
                            i17++;
                        }
                    }
                    obtainAccessibilityEvent.setToIndex((semanticsNode5.scrollIndex + i17) - 1);
                }
                sendAccessibilityEvent(obtainAccessibilityEvent);
            }
            if (semanticsNode5.hasFlag(io.flutter.view.AccessibilityBridge.Flag.IS_LIVE_REGION) && semanticsNode5.didChangeLabel()) {
                sendWindowContentChangeEvent(semanticsNode5.f293394id);
            }
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode6 != null && semanticsNode6.f293394id == semanticsNode5.f293394id) {
                io.flutter.view.AccessibilityBridge.Flag flag = io.flutter.view.AccessibilityBridge.Flag.IS_SELECTED;
                if (!semanticsNode5.hadFlag(flag) && semanticsNode5.hasFlag(flag)) {
                    android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent2 = obtainAccessibilityEvent(semanticsNode5.f293394id, 4);
                    obtainAccessibilityEvent2.getText().add(semanticsNode5.label);
                    sendAccessibilityEvent(obtainAccessibilityEvent2);
                }
            }
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode7 = this.inputFocusedSemanticsNode;
            if (semanticsNode7 != null && semanticsNode7.f293394id == semanticsNode5.f293394id && ((semanticsNode2 = this.lastInputFocusedSemanticsNode) == null || semanticsNode2.f293394id != this.inputFocusedSemanticsNode.f293394id)) {
                this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
                sendAccessibilityEvent(obtainAccessibilityEvent(semanticsNode5.f293394id, 8));
            } else if (this.inputFocusedSemanticsNode == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            io.flutter.view.AccessibilityBridge.SemanticsNode semanticsNode8 = this.inputFocusedSemanticsNode;
            if (semanticsNode8 != null && semanticsNode8.f293394id == semanticsNode5.f293394id) {
                io.flutter.view.AccessibilityBridge.Flag flag2 = io.flutter.view.AccessibilityBridge.Flag.IS_TEXT_FIELD;
                if (semanticsNode5.hadFlag(flag2) && semanticsNode5.hasFlag(flag2) && ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null || semanticsNode.f293394id == this.inputFocusedSemanticsNode.f293394id)) {
                    java.lang.String str = semanticsNode5.previousValue != null ? semanticsNode5.previousValue : "";
                    java.lang.String str2 = semanticsNode5.value != null ? semanticsNode5.value : "";
                    android.view.accessibility.AccessibilityEvent createTextChangedEvent = createTextChangedEvent(semanticsNode5.f293394id, str, str2);
                    if (createTextChangedEvent != null) {
                        sendAccessibilityEvent(createTextChangedEvent);
                    }
                    if (semanticsNode5.previousTextSelectionBase != semanticsNode5.textSelectionBase || semanticsNode5.previousTextSelectionExtent != semanticsNode5.textSelectionExtent) {
                        android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent3 = obtainAccessibilityEvent(semanticsNode5.f293394id, 8192);
                        obtainAccessibilityEvent3.getText().add(str2);
                        obtainAccessibilityEvent3.setFromIndex(semanticsNode5.textSelectionBase);
                        obtainAccessibilityEvent3.setToIndex(semanticsNode5.textSelectionExtent);
                        obtainAccessibilityEvent3.setItemCount(str2.length());
                        sendAccessibilityEvent(obtainAccessibilityEvent3);
                    }
                }
            }
        }
    }

    public AccessibilityBridge(android.view.View view, io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel, final android.view.accessibility.AccessibilityManager accessibilityManager, android.content.ContentResolver contentResolver, io.flutter.view.AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this.flutterSemanticsTree = new java.util.HashMap();
        this.customAccessibilityActions = new java.util.HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new java.util.ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        this.accessibilityMessageHandler = new io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void announce(java.lang.String str) {
                if (android.os.Build.VERSION.SDK_INT >= 36) {
                    io.flutter.Log.w(io.flutter.view.AccessibilityBridge.TAG, "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                }
                io.flutter.view.AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onFocus(int i17) {
                io.flutter.view.AccessibilityBridge.this.sendAccessibilityEvent(i17, 8);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onLongPress(int i17) {
                io.flutter.view.AccessibilityBridge.this.sendAccessibilityEvent(i17, 2);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTap(int i17) {
                io.flutter.view.AccessibilityBridge.this.sendAccessibilityEvent(i17, 1);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTooltip(java.lang.String str) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent = io.flutter.view.AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                obtainAccessibilityEvent.getText().add(str);
                io.flutter.view.AccessibilityBridge.this.sendAccessibilityEvent(obtainAccessibilityEvent);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
                byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                io.flutter.view.AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
                byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                for (java.nio.ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                }
                io.flutter.view.AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z17) {
                if (io.flutter.view.AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (z17) {
                    io.flutter.view.AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(io.flutter.view.AccessibilityBridge.this.accessibilityMessageHandler);
                    io.flutter.view.AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                } else {
                    io.flutter.view.AccessibilityBridge.this.setAccessibleNavigation(false);
                    io.flutter.view.AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(null);
                    io.flutter.view.AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                }
                if (io.flutter.view.AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    io.flutter.view.AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z17, io.flutter.view.AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                }
            }
        };
        this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        android.database.ContentObserver contentObserver = new android.database.ContentObserver(new android.os.Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                onChange(z17, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17, android.net.Uri uri) {
                if (io.flutter.view.AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (android.provider.Settings.Global.getFloat(io.flutter.view.AccessibilityBridge.this.contentResolver, "transition_animation_scale", 1.0f) == 0.0f) {
                    io.flutter.view.AccessibilityBridge.access$1176(io.flutter.view.AccessibilityBridge.this, io.flutter.view.AccessibilityBridge.AccessibilityFeature.DISABLE_ANIMATIONS.value);
                } else {
                    io.flutter.view.AccessibilityBridge.access$1172(io.flutter.view.AccessibilityBridge.this, ~io.flutter.view.AccessibilityBridge.AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                io.flutter.view.AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
            }
        };
        this.animationScaleObserver = contentObserver;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
        accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public void onTouchExplorationStateChanged(boolean z17) {
                if (io.flutter.view.AccessibilityBridge.this.isReleased) {
                    return;
                }
                if (!z17) {
                    io.flutter.view.AccessibilityBridge.this.setAccessibleNavigation(false);
                    io.flutter.view.AccessibilityBridge.this.onTouchExplorationExit();
                }
                if (io.flutter.view.AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    io.flutter.view.AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager.isEnabled(), z17);
                }
            }
        };
        this.touchExplorationStateChangeListener = touchExplorationStateChangeListener;
        touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        this.accessibilityFeatureFlags |= io.flutter.view.AccessibilityBridge.AccessibilityFeature.NO_ANNOUNCE.value;
        contentObserver.onChange(false);
        contentResolver.registerContentObserver(android.provider.Settings.Global.getUriFor("transition_animation_scale"), false, contentObserver);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            setBoldTextFlag();
        }
        platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
    }

    public android.view.accessibility.AccessibilityNodeInfo obtainAccessibilityNodeInfo(android.view.View view, int i17) {
        return android.view.accessibility.AccessibilityNodeInfo.obtain(view, i17);
    }

    public boolean onAccessibilityHoverEvent(android.view.MotionEvent motionEvent, boolean z17) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        io.flutter.view.AccessibilityBridge.SemanticsNode hitTest = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z17);
        if (hitTest != null && hitTest.platformViewId != -1) {
            if (z17) {
                return false;
            }
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(hitTest.f293394id, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                onTouchExplorationExit();
            } else {
                io.flutter.Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
        } else {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z17);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    public android.view.accessibility.AccessibilityEvent obtainAccessibilityEvent(int i17) {
        return android.view.accessibility.AccessibilityEvent.obtain(i17);
    }
}
